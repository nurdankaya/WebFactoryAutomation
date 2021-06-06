31 lines (29 sloc)  715 Bytes
  
<template>
  <div class="col-md-3">
    <div class="card">
      <img :src="image" :alt="name" class="card-img-top" />
      <div class="card-body">
        <h4 class="card-title">{{ name }}</h4>
        <div class="card-text">Ürün tipi : {{ type }}</div>
        <div class="row justify-content-end">
          <button class="btn btn-primary" @click="addToCart(id)">
            Sepete Ekle
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Item",
  props: ["type", "name", "image", "id"],

  methods: {
    addToCart(invId) {
      this.$store.dispatch("addToCart", invId);
    },
  },
};
</script>