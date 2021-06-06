
<template>
  <div id="verticalNav" class="vh-100">
    <h3 class="" id="sidebar-no-header-title">HOŞGELDİNİZ!</h3>
    <h2 class="m-5">FABRİKA OTOMASYONU PERSONEL SAYFASI</h2>
    <nav>
      <b-nav vertical variant="dark">
        <router-link to="/orders">
          <b-button class="mb-5" variant="primary" block>Siparişler</b-button>
        </router-link>
        <router-link to="/machines">
          <b-button class="mb-5" variant="primary" block>Makineler</b-button>
        </router-link>
        <router-link to="/products">
          <b-button class="mb-5" variant="primary" block>Ürünler</b-button>
        </router-link>
        <router-link to="/planning">
          <b-button class="mb-5" variant="primary" block
            >Siparişi Planla</b-button
          >
        </router-link>
      </b-nav>
    </nav>
  </div>
</template>

<script>
export default {
  name: "NavUser",
};
</script>
<style >
#verticalNav {
  background-color: grey;
}
</style>