<template>
  <div class="container">
    <div class="row">
      <div class="col-12 text-center">
        <h3 class="pt-3">Our Categories</h3>
        <router-link :to="{ name: 'AddCategory' }">
          <button class="btn" style="float:right">Add Category</button>
        </router-link>
      </div>
    </div>
    <div class="row">
      <div
        v-for="category of categories"
        :key="category.id"
        class="col-xl-4 col-md-6 col-12 pt-3 d-flex"
      >
        <CategoryBox :category="category"> </CategoryBox>
      </div>
    </div>
  </div>
</template>
<script>
const axios = require("axios");
import CategoryBox from "../../components/Category/CategoryBox.vue";

export default {
  name: "Category",
  components: { CategoryBox },
  data() {
    return {
      baseURL: "https://limitless-lake-55070.herokuapp.com",
      categories: [],
    };
  },
  methods: {
    async getCategories() {
      try {
        const response = await axios.get(`${this.baseURL}/category/?_embed=products`);
        this.categories = response.data;
      } catch (error) {
        console.error("Error fetching categories:", error);
      }
    },
  },
  mounted() {
    this.getCategories();
  },
};
</script>

<style scoped></style>