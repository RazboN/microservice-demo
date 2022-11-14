const app = require("./app");
const app_port = process.env.APP_PORT || 8003;
const { CakesRoutes } = require("./routes");

app.use(CakesRoutes);

app.listen(app_port, () => {
    console.log(`Server runs on port ${process.env.APP_PORT}`);
})