const express = require("express");
const helmet = require("helmet");
const cors = require("cors");
const config = require("./config");
const loaders = require("./load");

config();
//loaders(); 

const app = express();

app.use(helmet());
app.use(express.json());

app.use(
    cors({
      origin: ["http://localhost:8003"],
      methods: ["GET", "PUT", "DELETE", "UPDATE"],
      credentials: true,
    })
  );

module.exports = app;