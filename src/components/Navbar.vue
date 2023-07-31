<template>
    <nav class="navbar navbar-expand-lg custom-navbar">
      <!-- Navbar content -->
      <!--    Logo-->
      <router-link class="navbar-brand" :to="{ name: 'Home' }">
        <span id="logo-text">
        <span style="color: white;">Ino</span>
        <span style="color: purple;">Web</span>
      </span>
      </router-link>
      <!--    Burger Button-->
      <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <!--      Search Bar-->
        <form class="form-inline ml-auto mr-auto">
          <div class="input-group">
            <input
              size="100"
              type="text"
              class="form-control"
              placeholder="Search Items"
              aria-label="Username"
              aria-describedby="basic-addon1"
            />
            <div class="input-group-prepend">
              <span class="input-group-text" id="search-button-navbar">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="16"
                  height="16"
                  fill="currentColor"
                  class="bi bi-search"
                  viewBox="0 0 16 16"
                >
                  <path
                    d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"
                  />
                </svg>
              </span>
            </div>
          </div>
        </form>
        <router-link :to="{ name: 'Admin' }"> Admin </router-link>
      </div>
    </nav>
  </template>


  <script>
  export default {
    name: "Navbar",
  };
  </script>

<style>

/* Customize the color of the navbar-toggler-icon */
.custom-navbar .navbar-toggler-icon {
  background-image: url("data:image/svg+xml;charset=utf-8,%3Csvg viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath fill='%23fff' d='M0 1h16v2H0zm0 4h16v2H0zm0 4h16v2H0zm0 4h16v2H0z'/%3E%3C/svg%3E");
}

/* Customize the color of the navbar-toggler-icon on hover/focus */
.custom-navbar .navbar-toggler-icon:hover,
.custom-navbar .navbar-toggler-icon:focus {
  background-image: url("data:image/svg+xml;charset=utf-8,%3Csvg viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath fill='%23ccc' d='M0 1h16v2H0zm0 4h16v2H0zm0 4h16v2H0zm0 4h16v2H0z'/%3E%3C/svg%3E");
}
</style>
