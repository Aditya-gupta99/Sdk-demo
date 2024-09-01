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

import org.openapitools.client.models.StaffData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param description 
 * @param endDate 
 * @param endTime 
 * @param id 
 * @param isFullDay 
 * @param officeId 
 * @param officeName 
 * @param staffId 
 * @param staffName 
 * @param staffOptions 
 * @param startDate 
 * @param startTime 
 * @param tellerId 
 * @param tellerName 
 */


data class CashierData (

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "endDate")
    val endDate: java.time.LocalDate? = null,

    @Json(name = "endTime")
    val endTime: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "isFullDay")
    val isFullDay: kotlin.Boolean? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null,

    @Json(name = "staffId")
    val staffId: kotlin.Long? = null,

    @Json(name = "staffName")
    val staffName: kotlin.String? = null,

    @Json(name = "staffOptions")
    val staffOptions: kotlin.collections.List<StaffData>? = null,

    @Json(name = "startDate")
    val startDate: java.time.LocalDate? = null,

    @Json(name = "startTime")
    val startTime: kotlin.String? = null,

    @Json(name = "tellerId")
    val tellerId: kotlin.Long? = null,

    @Json(name = "tellerName")
    val tellerName: kotlin.String? = null

) {


}

