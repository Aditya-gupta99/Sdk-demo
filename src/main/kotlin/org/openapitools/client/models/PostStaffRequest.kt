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


import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * PostStaffRequest
 *
 * @param dateFormat
 * @param externalId
 * @param firstname
 * @param isActive
 * @param isLoanOfficer
 * @param joiningDate
 * @param lastname
 * @param locale
 * @param mobileNo
 * @param officeId
 */

@Serializable
data class PostStaffRequest(

    val dateFormat: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val isActive: kotlin.Boolean? = null,

    val isLoanOfficer: kotlin.Boolean? = null,

    @Contextual
    val joiningDate: java.time.LocalDate? = null,

    val lastname: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val mobileNo: kotlin.String? = null,

    val officeId: kotlin.Long? = null

)

