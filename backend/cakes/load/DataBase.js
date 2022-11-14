const Monngoose = require("mongoose");
const db = Monngoose.connection;

db.on("error", () => {
  console.log("DB connection error!");
});

db.once("open", () => {
  console.log("Connected to DB...");
});

const connectDB = async () => {
  await Monngoose.connect(
    `mongodb://${process.env.DB_HOST}:${process.env.DB_PORT}/${process.env.DB_NAME}`,
    {
      useNewUrlParser: true,
      useUnifiedTopology: true,
    }
  );
};

const closeConnection = async () => {
  await Monngoose.connection.close();
};

module.exports = {
  connectDB,
  closeConnection,
};
