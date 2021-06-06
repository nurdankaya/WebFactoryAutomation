<template>
  <div>
    <b-container fluid>
      <b-row>
        <div class="col-md-3">
          <NavUser></NavUser>
        </div>
        <div class="col-md-9">
          <Table :items="items"></Table>
        </div>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import NavUser from "../components/NavUser.vue";
import Table from "../components/Table.vue";

export default {
  name: "UserMachine",
  components: {
    NavUser,
    Table,
  },
  data() {
    return {};
  },
  computed: {
    items() {
      return this.$store.getters.getMachines;
    },
  },
  created: function () {
    this.$store.dispatch("getMachines");
  },
};
</script>
