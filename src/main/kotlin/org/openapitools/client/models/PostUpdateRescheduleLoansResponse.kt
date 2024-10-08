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
 * PostUpdateRescheduleLoansResponse
 *
 * @param changes
 * @param clientId
 * @param loanId
 * @param officeId
 * @param resourceId
 */

@Serializable
data class PostUpdateRescheduleLoansResponse(

    val changes: PostUpdateRescheduleLoanChanges? = null,

    val clientId: kotlin.Long? = null,

    val loanId: kotlin.Long? = null,

    val officeId: kotlin.Long? = null,

    val resourceId: kotlin.Long? = null

)

