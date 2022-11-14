const { CakeSchema } = require("../model/CakeSchema");

const getCakes = async () => {
    return await CakeSchema.find({});
};

const getSpecifisCake = async (cakeName) => {
    return await CakeSchema.find({name: cakeName});
};

module.exports = {
    getCakes,
    getSpecifisCake
}