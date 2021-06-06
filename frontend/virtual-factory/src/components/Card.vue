<template>
  <div>
    <b-button v-b-modal.modal-1 variant="danger">
      SEPETİM ({{ numInCart }})
    </b-button>
    <b-modal id="modal-1" title="Sepetim">
      <div class="modal-header">
        <h5 class="modal-title">Ürünler</h5>
      </div>
      <b-table striped hover :items="cart" :fields="fields">
        <template #cell(type)="row"> {{ row.item.productType }} </template>
        <template #cell(name)="row"> {{ row.item.productName }} </template>

        <template #cell(cancel)="row">
          <b-button
            class="close"
            data-dismiss="modal"
            @click="removeFromCart(row.index)"
            >&times;
          </b-button>
        </template>
      </b-table>

      <template #modal-footer>
        <div>
          Termin Tarihi :
          <b-form-input type="text" v-model="temp"></b-form-input>

          <button
            class="btn btn-secondary"
            data-dismiss="modal"
            @click="closeModel()"
          >
            Alışverişe devam et
          </button>
          <button class="btn btn-primary" @click="order()">Sipariş Ver</button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script>
export default {
  name: "Card",
  data() {
    return {
      temp: "",
      fields: [
        {
          key: "type",
          label: "Ürün Tipi",
          sortable: true,
          sortDirection: "desc",
        },
        {
          key: "name",
          label: "Ürün Adı",
          sortable: true,
          class: "text-center",
        },
        { key: "cancel", label: "İptal Et" },
      ],
    };
  },
  computed: {
    inCart() {
      return this.$store.getters.inCart;
    },
    numInCart() {
      return this.inCart.length;
    },
    cart() {
      return this.$store.getters.inCart.map((cartItem) => {
        return this.$store.getters.salablePoducts.find((forSaleItem) => {
          return cartItem.productId === forSaleItem.productId;
        });
      });
    },
    products() {
      return this.$store.productsForSale;
    },
  },

  methods: {
    removeFromCart(index) {
      this.$store.dispatch("removeFromCart", index);
    },
    closeModel() {
      this.$bvModal.hide("modal-1");
    },
    order() {
      this.$store.commit("setDeadline", this.temp);
      this.$store.dispatch("order");
    },
  },
};
</script>