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
 * List of PostLoansDisbursementData
 *
 * @param expectedDisbursementDate
 * @param principal
 */

@Serializable
data class PostLoansDisbursementData(

    @Contextual
    val expectedDisbursementDate: java.time.LocalDate? = null,

    val principal: kotlin.Double? = null

)

