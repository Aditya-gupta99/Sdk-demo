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
 *
 *
 * @param allowCompoundingOnEod
 * @param arrearsBasedOnOriginalSchedule
 * @param compoundingToBePostedAsTransaction
 * @param id
 * @param interestRecalculationCompoundingType
 * @param isArrearsBasedOnOriginalSchedule
 * @param isCompoundingToBePostedAsTransaction
 * @param preClosureInterestCalculationStrategy
 * @param productId
 * @param recalculationCompoundingFrequencyInterval
 * @param recalculationCompoundingFrequencyNthDay
 * @param recalculationCompoundingFrequencyOnDay
 * @param recalculationCompoundingFrequencyType
 * @param recalculationCompoundingFrequencyWeekday
 * @param recalculationRestFrequencyInterval
 * @param recalculationRestFrequencyNthDay
 * @param recalculationRestFrequencyOnDay
 * @param recalculationRestFrequencyType
 * @param recalculationRestFrequencyWeekday
 * @param rescheduleStrategyType
 */

@Serializable
data class LoanProductInterestRecalculationData(

    val allowCompoundingOnEod: kotlin.Boolean? = null,

    val arrearsBasedOnOriginalSchedule: kotlin.Boolean? = null,

    val compoundingToBePostedAsTransaction: kotlin.Boolean? = null,

    val id: kotlin.Long? = null,

    val interestRecalculationCompoundingType: EnumOptionData? = null,

    val isArrearsBasedOnOriginalSchedule: kotlin.Boolean? = null,

    val isCompoundingToBePostedAsTransaction: kotlin.Boolean? = null,

    val preClosureInterestCalculationStrategy: EnumOptionData? = null,

    val productId: kotlin.Long? = null,

    val recalculationCompoundingFrequencyInterval: kotlin.Int? = null,

    val recalculationCompoundingFrequencyNthDay: EnumOptionData? = null,

    val recalculationCompoundingFrequencyOnDay: kotlin.Int? = null,

    val recalculationCompoundingFrequencyType: EnumOptionData? = null,

    val recalculationCompoundingFrequencyWeekday: EnumOptionData? = null,

    val recalculationRestFrequencyInterval: kotlin.Int? = null,

    val recalculationRestFrequencyNthDay: EnumOptionData? = null,

    val recalculationRestFrequencyOnDay: kotlin.Int? = null,

    val recalculationRestFrequencyType: EnumOptionData? = null,

    val recalculationRestFrequencyWeekday: EnumOptionData? = null,

    val rescheduleStrategyType: EnumOptionData? = null

)

