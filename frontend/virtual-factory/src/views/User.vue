<template>
  <div>
    <NavLogin></NavLogin>
    <LoginForm :whoLogin="'Personel'"></LoginForm>
  </div>
</template>

<script>
import NavLogin from "../components/NavLogin.vue";
import LoginForm from "../components/LoginForm.vue";

export default {
  name: "User",
  components: {
    NavLogin,
    LoginForm,
  },
};
</script>
