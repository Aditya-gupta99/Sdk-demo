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

package org.openapitools.client.models

import org.openapitools.client.models.PutRecurringDepositProductsChanges

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutRecurringDepositProductsResponse
 *
 * @param changes 
 * @param resourceId 
 */


data class PutRecurringDepositProductsResponse (

    @Json(name = "changes")
    val changes: PutRecurringDepositProductsChanges? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Int? = null

) {


}

