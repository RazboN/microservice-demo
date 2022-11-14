const mongoose = require("mongoose");

const CakeSchema = new mongoose.Schema(
    {
      name: { type: String },
      price: { type: Number },
      ingredients: { type: Array },
    },
    {
      collection: "Cakes",
      versionKey: false,
      default: undefined,
    }
  );

  const CakeModel = mongoose.model("CakeSchema", CakeSchema);

  module.exports = { CakeModel }