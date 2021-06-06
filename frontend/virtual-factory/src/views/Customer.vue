<template>
  <div>
    <NavLogin></NavLogin>
    <LoginForm :whoLogin="'Müşteri'"></LoginForm>
  </div>
</template>

<script>
import NavLogin from "../components/NavLogin.vue";
import LoginForm from "../components/LoginForm.vue";

export default {
  name: "Customer",
  components: {
    NavLogin,
    LoginForm,
  },
};
</script>
