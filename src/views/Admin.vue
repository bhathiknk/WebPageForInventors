<template>
<div class="container">
  <router-link :to="{name: 'Category'}" >
    <button class="btn-admin  btn-lg"> Admin Category</button>
  </router-link>
  <br />
  <router-link :to="{name: 'AdminProduct'}" >
    <button class="btn-admin  btn-lg"> Admin Product</button>
  </router-link>
</div>


</template>
<script>
export default {

}
</script>
<style>

</style>