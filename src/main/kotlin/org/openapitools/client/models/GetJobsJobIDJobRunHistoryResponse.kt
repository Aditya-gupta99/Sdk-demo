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

import kotlinx.serialization.Serializable

/**
 * GetJobsJobIDJobRunHistoryResponse
 *
 * @param pageItems
 * @param totalFilteredRecords
 */

@Serializable
data class GetJobsJobIDJobRunHistoryResponse(

    val pageItems: kotlin.collections.List<JobDetailHistoryDataSwagger>? = null,

    val totalFilteredRecords: kotlin.Int? = null

)

