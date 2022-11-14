const Cake = require("../model/CakeSchema");
const chai = require("chai");
const chaiHttp = require("chai-http");
const app = require("../app");
const { CakesRoutes } = require("../routes");

app.use(CakesRoutes);

chai.should();

chai.use(chaiHttp);

const baseUri = process.env.BASE_API_ADDRESS;

/*describe("/GET cakes menu", () => {
    it("it should GET all the cakes", (done) => {
      chai
        .request(app)
        .get(`${baseUri}${process.env.GET_ALL_ITEMS}`)
        .end((err, res) => {
          res.should.have.status(200);
          res.body.data.should.be.a("array");
          res.body.data.length.should.be.eql(0);
          done();
        });
    });
  });*/

  describe("/GET specific cake", () => {
    it("it should GET a cake", (done) => {
      chai
        .request(app)
        .get(`${baseUri}${process.env.GET_AN_ITEM}`)
        .end((err, res) => {
          res.should.have.status(200);
          res.body.data.should.be.a("string");
          res.body.data.should.be.eql("getCake controller response");
          done();
        });
    });
  });