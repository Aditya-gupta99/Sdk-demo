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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param activatedDate 
 * @param approvedByFirstname 
 * @param approvedByLastname 
 * @param approvedByUsername 
 * @param approvedDate 
 * @param submittedByFirstname 
 * @param submittedByLastname 
 * @param submittedByUsername 
 * @param submittedOnDate 
 */


data class GetAccountsTimeline (

    @Json(name = "activatedDate")
    val activatedDate: java.time.LocalDate? = null,

    @Json(name = "approvedByFirstname")
    val approvedByFirstname: kotlin.String? = null,

    @Json(name = "approvedByLastname")
    val approvedByLastname: kotlin.String? = null,

    @Json(name = "approvedByUsername")
    val approvedByUsername: kotlin.String? = null,

    @Json(name = "approvedDate")
    val approvedDate: java.time.LocalDate? = null,

    @Json(name = "submittedByFirstname")
    val submittedByFirstname: kotlin.String? = null,

    @Json(name = "submittedByLastname")
    val submittedByLastname: kotlin.String? = null,

    @Json(name = "submittedByUsername")
    val submittedByUsername: kotlin.String? = null,

    @Json(name = "submittedOnDate")
    val submittedOnDate: java.time.LocalDate? = null

) {


}

