import Vue from "vue";
import VueRouter from "vue-router";
import User from "../views/User.vue";
import Customer from "../views/Customer.vue";
import MainPageCustomer from "../views/MainPageCustomer.vue";
import MainPageUser from "../views/MainPageUser.vue";
import UserOrder from "../views/UserOrder.vue";
import UserMachine from "../views/UserMachine.vue";
import UserPlanning from "../views/UserPlanning.vue";
import UserProducts from "../views/UserProducts.vue";


Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Customer",
    component: Customer,
  },
  {
    path: "/customer",
    name: "Customer",
    component: Customer,
  },
  {
    path: "/user",
    name: "User",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: User,
  },
  {
    path: "/maincustomer",
    name: "MainPageCustomer",
    component: MainPageCustomer,
  },
  {
    path: "/mainuser",
    name: "MainPageUser",
    component: MainPageUser,
  },
  {
    path: "/orders",
    name: "UserOrder",
    component: UserOrder,
  },
  {
    path: "/machines",
    name: "UserMachine",
    component: UserMachine,
  },
  {
    path: "/planning",
    name: "UserPlanning",
    component: UserPlanning,
  },
  {
    path: "/products",
    name: "UserProducts",
    component: UserProducts,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
