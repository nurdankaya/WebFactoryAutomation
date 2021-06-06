<template>
  <div>
    <b-container fluid>
      <b-row align-v="center">
        <div class="col-md-3">
          <NavUser></NavUser>
        </div>
        <div class="col-md-9">
          <Table :items="titems"></Table>
          <b-form-group id="input-group-1" label="Ürün:" label-for="input-1">
            <b-form-select
              id="input-1"
              v-model="selectedProduct"
              :options="items"
              required
            ></b-form-select>
            <b-button variant="success" @click="TakeSubProduct">Seç</b-button>
          </b-form-group>
          <b-form-group
            id="input-group-2"
            label="Alt Ürünleri:"
            label-for="input-2"
          >
            <b-form-select
              id="input-2"
              v-model="selectedSubProduct"
              :options="subProducts"
              required
            ></b-form-select>
          </b-form-group>
          <b-form-group
            id="input-group-3"
            label="Makine Seç:"
            label-for="input-3"
          >
            <b-form-select
              id="input-3"
              :options="machines"
              v-model="plan.wcName"
              required
            ></b-form-select>
          </b-form-group>
          <b-button variant="danger" size="lg" @click="recordPlan"
            >Kaydet</b-button
          >
        </div>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import NavUser from "../components/NavUser.vue";
import Table from "../components/Table.vue";

export default {
  name: "UserPlanning",
  components: {
    NavUser,
    Table,
  },
  data() {
    return {
      selectedSubProduct: "",
      plan: {
        pid: "",
        wcName: "",
      },
    };
  },
  computed: {
    selectedProduct: {
      get() {
        return this.$store.state.selectedProduct;
      },
      set(newp) {
        this.$store.state.selectedProduct = newp;
      },
    },
    items() {
      let products = this.$store.getters.getOrderItems;
      let result = products.map((a) => a.productId);
      return result;
    },
    titems() {
      return this.$store.getters.getPlans;
    },

    subProducts() {
      let subproducts = this.$store.getters.getSubProducts;
      let result = subproducts.map((a) => a.subProductId);
      return result;
    },
    machines() {
      let machines = this.$store.getters.getMachines;
      let result = machines.map((a) => a.wcName);
      return result;
    },
  },
  created: function () {
    this.$store.dispatch("getOrderItems");
    this.$store.dispatch("getMachines");
    this.$store.dispatch("getPlans");
  },
  methods: {
    TakeSubProduct() {
      this.$store.dispatch("getSubProducts");
    },
    recordPlan(event) {
      this.plan.pid = this.selectedSubProduct;
      this.$store.dispatch("savePlan", this.plan);
      this.$store.dispatch("getPlans");
    },
  },
};
</script>
