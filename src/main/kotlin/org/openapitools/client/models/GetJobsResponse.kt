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
 * GetJobsResponse
 *
 * @param active
 * @param cronExpression
 * @param currentlyRunning
 * @param displayName
 * @param initializingError
 * @param jobId
 * @param lastRunHistory
 * @param nextRunTime
 */

@Serializable
data class GetJobsResponse(

    val active: kotlin.Boolean? = null,

    val cronExpression: kotlin.String? = null,

    val currentlyRunning: kotlin.Boolean? = null,

    val displayName: kotlin.String? = null,

    val initializingError: kotlin.String? = null,

    val jobId: kotlin.Long? = null,

    val lastRunHistory: JobDetailHistoryData? = null,

    @Contextual
    val nextRunTime: java.time.OffsetDateTime? = null

)

