<template>
  <div>
    <b-container fluid>
      <b-row>
        <div class="col-md-3">
          <NavUser></NavUser>
        </div>
        <div class="col-md-9">
          <Table :items="items"></Table>

          <div>
            <b-form>
              <b-form-group
                id="input-group-1"
                label="Ürün id:"
                label-for="input-1"
              >
                <b-form-input
                  id="input-1"
                  v-model="product.productId"
                  placeholder=""
                  required
                ></b-form-input>
              </b-form-group>

              <b-form-group
                id="input-group-2"
                label="Ürün adı:"
                label-for="input-2"
              >
                <b-form-input
                  id="input-2"
                  v-model="product.productName"
                  placeholder=""
                  required
                ></b-form-input>
              </b-form-group>

              <b-form-group
                id="input-group-3"
                label="Ürün tipi:"
                label-for="input-3"
              >
                <b-form-input
                  id="input-2"
                  v-model="product.productType"
                  placeholder=""
                  required
                ></b-form-input>
              </b-form-group>

              <b-form-checkbox
                id="checkbox-1"
                v-model="product.salable"
                name="checkbox-1"
                value="true"
                unchecked-value="false"
              >
                salable
              </b-form-checkbox>

              <b-button @click="onSubmit" variant="primary">Kaydet</b-button>
            </b-form>
          </div>
        </div>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import NavUser from "../components/NavUser.vue";
import Table from "../components/Table.vue";

export default {
  name: "UserProducts",
  components: {
    NavUser,
    Table,
  },
  data() {
    return {
      product: {
        productId: "",
        productName: "",
        productType: "",
        salable: {
          type: Boolean,
        },
      },
    };
  },
  computed: {
    items() {
      return this.$store.getters.getAllProducts;
    },
  },
  created: function () {
    this.$store.dispatch("getAllProducts");
  },
  methods: {
    onSubmit(event) {
      this.$store.dispatch("saveProduct", this.product);
      this.items = this.$store.getters.getAllProducts;
    },
  },
};
</script>
