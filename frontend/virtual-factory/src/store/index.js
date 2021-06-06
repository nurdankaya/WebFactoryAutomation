import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";
import router from "../router";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    //$store
    currId: "",
    currName: "",
    currPassw: "",
    user: {
    },
    customer: {
    },
    customers: [],
    productsForSale: [],
    img: '//placehold.it/200',
    forSale: [],
    inCart: [],
    deadline: '',
    responseOrder: {},
    orderItems: [],
    machines: [],
    subProducts: [],
    selectedProduct: "",
    workCenters: [],
    allProducts: [],
    plans: [],
  },
  mutations: {
    //commit
    loginCustomer(state, payload) { this.state.customer = payload; },
    loginUser(state, payload) { this.state.user = payload; },
    responseOrder(state, payload) { this.state.responseOrder = payload; },
    addToCart(state, pId) {
      var products = this.state.productsForSale;
      products.forEach(function (product) {
        if (pId == product.productId)           //if salable product's pid(productid) equals given id, add this product to inCart array 
          state.inCart.push(product);
      });
      console.log(state.inCart)
    },
    removeFromCart(state, index) { this.state.inCart.splice(index, 1); },

    salableProducts(state, payload) { this.state.productsForSale = payload; },
    getOrderItems(state, payload) { this.state.orderItems = payload; },
    getMachines(state, payload) { this.state.machines = payload; },
    setDeadline(state, deadline) { state.deadline = deadline; },
    setSubProducts(state, payload) { state.subProducts = payload; },
    setWorkCenters(state, payload) { state.workCenters = payload; },
    setAllProducts(state, payload) { state.allProducts = payload; },
    setPlans(state, payload) { state.plans = payload; },
  },
  actions: {
    // dispatch
    loginCustomer(context) {
      var url =
        "http://localhost:8080/factory/api/customer/" + this.state.currName;
      axios
        .get(url)
        .then((response) => {
          context.commit("loginCustomer", response.data);
          if (this.state.currPassw == this.state.customer.password) {
            this.state.currId = this.state.customer.customerId;
            router.push({ name: "MainPageCustomer" });
          }
        })
        .catch(function (error) {
          if (error.response) {
            alert("Yanlış isim ya da parola!");
          }
        });
    },
    loginUser(context) {
      var url = "http://localhost:8080/factory/api/user/" + this.state.currName;
      axios
        .get(url)
        .then((response) => {
          context.commit("loginUser", response.data);
          if (this.state.currPassw == this.state.user.password) {
            this.state.currId = this.state.user.userId;
            router.push({ name: "MainPageUser" });
          }
        })
        .catch(function (error) {
          if (error.response) {
            alert("Yanlış isim ya da parola!");
          }
        });
    },
    getSalableProducts(context) {
      axios
        .get("http://localhost:8080/factory/api/salableproducts/")
        .then((response) => {
          context.commit("salableProducts", response.data);
        });
    },
    getAllProducts(context) {
      axios
        .get("http://localhost:8080/factory/api/products/")
        .then((response) => {
          context.commit("setAllProducts", response.data);
        });
    },
    getPlans(context) {
      axios
        .get("http://localhost:8080/factory/api/plan/")
        .then((response) => {
          console.log(response.data)
          context.commit("setPlans", response.data);
        });
    },
    savePlan(context, plan) {
      console.log(plan);
      axios
        .post("http://localhost:8080/factory/api/plan/", {
          productId: plan.pid,
          workCenterName: plan.wcName,
        })
        .then(() => {
          context.dispatch("getAllProducts");
        });
    },
    saveProduct(context, product) {

      axios
        .post("http://localhost:8080/factory/api/product/", {
          productId: product.productId,
          productName: product.productName,
          productType: product.productType,
          isSalable: product.salable
        })
        .then(() => {
          context.dispatch("getAllProducts");
        });
    },
    order(context) {
      var today = new Date();
      var dd = String(today.getDate()).padStart(2, '0');
      var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
      var yyyy = today.getFullYear();
      today = yyyy + '-' + mm + '-' + dd;

      axios.post("http://localhost:8080/factory/api/order", {  //add order info into orders table
        customerId: this.state.currId,
        deadline: this.state.deadline,
        orderDate: today
      }).then((response) => {

        context.commit("responseOrder", response.data);
        console.log(response.data)
        var temp = this.state.inCart;
        var orderid = this.state.responseOrder.orderId;

        temp.forEach(function (product) {
          var pid = product.productId;
          axios.post("http://localhost:8080/factory/api/orderItem", {  //add order items info into orderitems table
            orderId: orderid,
            productId: pid,
            amount: 3,
          });
        });

      });

    },
    getOrderItems(context) {
      axios
        .get("http://localhost:8080/factory/api/orderItems/")
        .then((response) => {
          context.commit("getOrderItems", response.data);
        });
    },
    getMachines(context) {
      axios
        .get("http://localhost:8080/factory/api/workCenters/")
        .then((response) => {
          context.commit("getMachines", response.data);
        });
    },
    getSubProducts(context) {
      var url = "http://localhost:8080/factory/api/subProductTree/" + this.state.selectedProduct;
      axios
        .get(url)
        .then((response) => {
          context.commit("setSubProducts", response.data);
        })
    },
    addToCart(context, pId) {
      context.commit('addToCart', pId);
    },
    removeFromCart(context, index) { context.commit('removeFromCart', index); },
  },
  getters: {

    forSale: state => state.forSale,
    inCart: state => state.inCart,
    salablePoducts: state => state.productsForSale,
    getImg: state => state.img,
    getDeadline: state => state.deadline,
    getOrderItems: state => state.orderItems,
    getMachines: state => state.machines,
    getSubProducts: state => state.subProducts,
    getAllProducts: state => state.allProducts,
    getPlans: state => state.plans,
  },
  modules: {},
});
