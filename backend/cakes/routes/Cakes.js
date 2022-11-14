const express = require("express");
const router = express.Router();
const { getCakesMenu, getCake } = require("../controller/Cakes_Controller");

/**
 * import controller
 * import schema validation
 * firstly it has only one endpoint -> get all cakes
 */

const baseUri = process.env.BASE_API_ADDRESS;

router.route(`${baseUri}${process.env.GET_ALL_ITEMS}`).get(getCakesMenu);
router.route(`${baseUri}${process.env.GET_AN_ITEM}`).get(getCake);

module.exports = router;