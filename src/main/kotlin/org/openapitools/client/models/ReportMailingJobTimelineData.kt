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
 *
 *
 * @param createdByFirstname
 * @param createdByLastname
 * @param createdByUsername
 * @param createdOnDate
 * @param updatedByFirstname
 * @param updatedByLastname
 * @param updatedByUsername
 * @param updatedOnDate
 */

@Serializable
data class ReportMailingJobTimelineData(

    val createdByFirstname: kotlin.String? = null,

    val createdByLastname: kotlin.String? = null,

    val createdByUsername: kotlin.String? = null,

    @Contextual
    val createdOnDate: java.time.LocalDate? = null,

    val updatedByFirstname: kotlin.String? = null,

    val updatedByLastname: kotlin.String? = null,

    val updatedByUsername: kotlin.String? = null,

    @Contextual
    val updatedOnDate: java.time.LocalDate? = null

)

