package com.microservices.drinksservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservices.drinksservice.entity.Drink;
import com.microservices.drinksservice.repository.DrinksRepository;
import com.mongodb.client.MongoClients;
import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.ImmutableMongodConfig;
import de.flapdoodle.embed.mongo.config.MongodConfig;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.UUID;

/*@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc*/
@DataMongoTest
@ExtendWith(SpringExtension.class)
class DrinksServiceApplicationTests {
/*
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private DrinksRepository _repo;

    @Autowired
    private Helpers _helpers;

    @Autowired
    private ObjectMapper objectMapper;

    private static final String CONNECTION_STRING = "mongodb://%s:%d";

    @Autowired
    private MongodExecutable mongodExecutable;
    @Autowired
    private MongoTemplate mongoTemplate;

    @AfterEach
    void clean() {
        mongodExecutable.stop();
    }
    @BeforeEach
    void setup() throws IOException {
        String ip = "localhost";
        int port = 27017;

        ImmutableMongodConfig mongodConfig = MongodConfig
                .builder()
                .version(Version.Main.PRODUCTION)
                .net(new Net(ip, port, Network.localhostIsIPv6()))
                .build();

        MongodStarter starter = MongodStarter.getDefaultInstance();
        mongodExecutable = starter.prepare(mongodConfig);
        mongodExecutable.start();
        mongoTemplate = new MongoTemplate(MongoClients.create(String.format(CONNECTION_STRING, ip, port)), "test");
    }
    @Test
    public void addItem() throws Exception {
        Drink newItem = Drink.builder()
                .id(UUID.randomUUID().toString())
                .name("test_drink")
                .price(666)
                .build();


        OngoingStubbing<Drink> retVal = when(mongoTemplate.save(newItem)).thenReturn(newItem);

        assertThat(retVal).isNotNull();
    }*/
}
