/*
 *  Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

plugins {
    java
}

dependencies {
    testImplementation(project(":core:common:junit"))
    // gives access to the Json LD models, etc.
    testImplementation(project(":spi:common:json-ld-spi"))
    testImplementation(project(":spi:control-plane:contract-spi"))
    testImplementation(project(":core:common:connector-core"))

    //useful for generic DTOs etc.
    testImplementation(project(":extensions:common:api:api-core"))
    testImplementation(project(":spi:control-plane:policy-spi"))
    testImplementation(project(":spi:control-plane:transfer-spi"))

    //we need the JacksonJsonLd util class
    testImplementation(project(":core:common:lib:json-ld-lib"))
    testImplementation(project(":extensions:common:json-ld"))

    testImplementation(libs.restAssured)
    testImplementation(libs.assertj)
    testImplementation(libs.awaitility)
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.jakartaJson)
    testImplementation(testFixtures(project(":extensions:common:sql:sql-core")))
    testImplementation(libs.testcontainers.junit)
    testImplementation(libs.testcontainers.postgres)

    testCompileOnly(project(":system-tests:management-api:management-api-test-runtime"))
}

edcBuild {
    publish.set(false)
}
