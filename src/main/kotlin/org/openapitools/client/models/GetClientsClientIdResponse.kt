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

import org.openapitools.client.models.GetClientsClientIdStatus
import org.openapitools.client.models.GetClientsGroups
import org.openapitools.client.models.GetClientsTimeline

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetClientsClientIdResponse
 *
 * @param accountNo 
 * @param activationDate 
 * @param active 
 * @param displayName 
 * @param emailAddress 
 * @param externalId 
 * @param firstname 
 * @param groups 
 * @param id 
 * @param lastname 
 * @param officeId 
 * @param officeName 
 * @param savingsProductId 
 * @param savingsProductName 
 * @param status 
 * @param timeline 
 */


data class GetClientsClientIdResponse (

    @Json(name = "accountNo")
    val accountNo: kotlin.String? = null,

    @Json(name = "activationDate")
    val activationDate: java.time.LocalDate? = null,

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "emailAddress")
    val emailAddress: kotlin.String? = null,

    @Json(name = "externalId")
    val externalId: kotlin.String? = null,

    @Json(name = "firstname")
    val firstname: kotlin.String? = null,

    @Json(name = "groups")
    val groups: kotlin.collections.List<GetClientsGroups>? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "lastname")
    val lastname: kotlin.String? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null,

    @Json(name = "savingsProductId")
    val savingsProductId: kotlin.Long? = null,

    @Json(name = "savingsProductName")
    val savingsProductName: kotlin.String? = null,

    @Json(name = "status")
    val status: GetClientsClientIdStatus? = null,

    @Json(name = "timeline")
    val timeline: GetClientsTimeline? = null

) {


}

