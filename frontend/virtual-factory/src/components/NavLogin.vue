<template>
  <div>
    <b-navbar toggleable="lg" type="dark" variant="dark">
      <b-navbar-brand tag="h1" class="mb-2 mt-2 font-weight-bolder" href="#"
        >X Fabrika</b-navbar-brand
      >

      <!-- Right aligned nav items -->
      <b-navbar-nav class="ml-auto">
        <b-nav-item>
          <router-link to="/customer"
            ><h5 class="text-info">Müşteri</h5>
          </router-link></b-nav-item
        >

        <b-nav-item>
          <router-link to="/user"
            ><h5 class="text-info">Personel</h5>
          </router-link></b-nav-item
        >
      </b-navbar-nav>
    </b-navbar>
  </div>
</template>

<script lang="ts">
import Vue from "vue";

export default Vue.extend({
  name: "NavLogin",
  data() {
    return {
      who: "",
    };
  },

  methods: {
    /* customer() {
      this.who = "Müşteri";
      this.$emit("who", this.who);
    },
    user() {
      this.who = "Personel";
      this.$emit("who", this.who); // to send data to parent component
    },*/
  },
});
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
