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

import org.openapitools.client.models.PutFundsFundIdRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutFundsFundIdResponse
 *
 * @param changes 
 * @param resourceId 
 */


data class PutFundsFundIdResponse (

    @Json(name = "changes")
    val changes: PutFundsFundIdRequest? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}

