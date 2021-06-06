<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>
import Vue from "vue";

export default Vue.extend({
  name: "App",
  data() {
    return {
      whoLogin: "Müşteri",
    };
  },

  methods: {
    login(x) {
      this.whoLogin = x;
    },
  },
});
</script>

<style></style>
