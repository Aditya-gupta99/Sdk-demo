/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.StandingInstructionsApi
import org.openapitools.client.models.GetStandingInstructionsResponse
import org.openapitools.client.models.GetStandingInstructionsStandingInstructionIdResponse
import org.openapitools.client.models.GetStandingInstructionsTemplateResponse
import org.openapitools.client.models.PostStandingInstructionsRequest
import org.openapitools.client.models.PostStandingInstructionsResponse
import org.openapitools.client.models.PutStandingInstructionsStandingInstructionIdRequest
import org.openapitools.client.models.PutStandingInstructionsStandingInstructionIdResponse

class StandingInstructionsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of StandingInstructionsApi
        //val apiInstance = StandingInstructionsApi()

        // to test create5
        should("test create5") {
            // uncomment below to test create5
            //val postStandingInstructionsRequest : PostStandingInstructionsRequest =  // PostStandingInstructionsRequest | 
            //val result : PostStandingInstructionsResponse = apiInstance.create5(postStandingInstructionsRequest)
            //result shouldBe ("TODO")
        }

        // to test retrieveAll19
        should("test retrieveAll19") {
            // uncomment below to test retrieveAll19
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
            //val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
            //val transferType : kotlin.Int = 56 // kotlin.Int | transferType
            //val clientName : kotlin.String = clientName_example // kotlin.String | clientName
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val fromAccountId : kotlin.Long = 789 // kotlin.Long | fromAccountId
            //val fromAccountType : kotlin.Int = 56 // kotlin.Int | fromAccountType
            //val result : GetStandingInstructionsResponse = apiInstance.retrieveAll19(externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType)
            //result shouldBe ("TODO")
        }

        // to test retrieveOne10
        should("test retrieveOne10") {
            // uncomment below to test retrieveOne10
            //val standingInstructionId : kotlin.Long = 789 // kotlin.Long | standingInstructionId
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
            //val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
            //val result : GetStandingInstructionsStandingInstructionIdResponse = apiInstance.retrieveOne10(standingInstructionId, externalId, offset, limit, orderBy, sortOrder)
            //result shouldBe ("TODO")
        }

        // to test template6
        should("test template6") {
            // uncomment below to test template6
            //val fromOfficeId : kotlin.Long = 789 // kotlin.Long | fromOfficeId
            //val fromClientId : kotlin.Long = 789 // kotlin.Long | fromClientId
            //val fromAccountId : kotlin.Long = 789 // kotlin.Long | fromAccountId
            //val fromAccountType : kotlin.Int = 56 // kotlin.Int | fromAccountType
            //val toOfficeId : kotlin.Long = 789 // kotlin.Long | toOfficeId
            //val toClientId : kotlin.Long = 789 // kotlin.Long | toClientId
            //val toAccountId : kotlin.Long = 789 // kotlin.Long | toAccountId
            //val toAccountType : kotlin.Int = 56 // kotlin.Int | toAccountType
            //val transferType : kotlin.Int = 56 // kotlin.Int | transferType
            //val result : GetStandingInstructionsTemplateResponse = apiInstance.template6(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType)
            //result shouldBe ("TODO")
        }

        // to test update9
        should("test update9") {
            // uncomment below to test update9
            //val standingInstructionId : kotlin.Long = 789 // kotlin.Long | standingInstructionId
            //val command : kotlin.String = command_example // kotlin.String | command
            //val putStandingInstructionsStandingInstructionIdRequest : PutStandingInstructionsStandingInstructionIdRequest =  // PutStandingInstructionsStandingInstructionIdRequest | 
            //val result : PutStandingInstructionsStandingInstructionIdResponse = apiInstance.update9(standingInstructionId, command, putStandingInstructionsStandingInstructionIdRequest)
            //result shouldBe ("TODO")
        }

    }
}
