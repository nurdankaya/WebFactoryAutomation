<template>
  <div class="bg-dark">
    <b-container>
      <b-row class="vh-100" align-v="center">
        <b-col></b-col>
        <b-col cols="8" class="bg-light">
          <h1 class="display-2 mb-5">{{ whoLogin }} Girişi</h1>
          <b-form @reset="onReset" v-if="show">
            <b-form-group
              id="input-group-1"
              label="Your Name:"
              label-for="input-1"
            >
              <b-form-input
                id="input-1"
                v-model="form.name"
                placeholder="Enter Name"
                required
              ></b-form-input>
            </b-form-group>

            <b-form-group
              id="input-group-2"
              label="Password:"
              label-for="input-2"
            >
              <b-form-input
                id="input-2"
                v-model="form.password"
                placeholder="Enter password"
                type="password"
                required
              ></b-form-input>
            </b-form-group>

            <b-button @click="onSubmit" type="submit" variant="primary">
              Giriş Yap</b-button
            >

            <b-button type="reset" variant="danger">Reset</b-button>
          </b-form>
        </b-col>
        <b-col></b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
export default {
  name: "LoginForm",
  props: {
    whoLogin: {
      default: "Müşteri",
    },
  },
  data() {
    return {
      link: "",
      form: {
        name: "",
        password: "",
      },

      show: true,
    };
  },

  methods: {
    onSubmit(event) {
      event.preventDefault();
      if (this.whoLogin == "Müşteri") {
        this.$store.state.currName = this.form.name;
        this.$store.state.currPassw = this.form.password;
        this.$store.dispatch("loginCustomer");
      } else if (this.whoLogin == "Personel") {
        this.$store.state.currName = this.form.name;
        this.$store.state.currPassw = this.form.password;
        this.$store.dispatch("loginUser");
      }
    },
    onReset(event) {
      event.preventDefault();
      // Reset our form values
      this.form.email = "";
      this.form.name = "";

      // Trick to reset/clear native browser form validation state
      this.show = false;
      this.$nextTick(() => {
        this.show = true;
      });
    },
  },
};
</script>

<style scoped>
.align-items-center {
  display: flex;
  align-items: center; /*Aligns vertically center */
  justify-content: center; /*Aligns horizontally center */
}
</style>
