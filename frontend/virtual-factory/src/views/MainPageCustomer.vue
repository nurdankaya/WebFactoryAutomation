<template>
  <div id="app" class="container my-5">
    <div class="row mb-3">
      <div class="col-md-9">
        <h1>Tüm Ürünler</h1>
      </div>
      <div class="col-md-3">
        <Card />
      </div>
    </div>

    <div class="row">
      <Item
        v-for="item in products"
        :key="item.productId"
        :id="item.productId"
        :type="item.productType"
        :name="item.productName"
        :image="img"
      />
    </div>
  </div>
</template>

<script>
import Item from "../components/Item.vue";
import Card from "../components/Card.vue";
export default {
  name: "MainPageCustomer",
  computed: {
    forSale() {
      return this.$store.getters.forSale;
    },
    products() {
      return this.$store.getters.salablePoducts;
    },
    img() {
      return this.$store.getters.getImg;
    },
  },
  components: {
    Item,
    Card,
  },
  created: function () {
    this.$store.dispatch("getSalableProducts");
  },
};
</script>