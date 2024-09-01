package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteInterestRateChartsChartIdResponse
import org.openapitools.client.models.GetInterestRateChartsResponse
import org.openapitools.client.models.GetInterestRateChartsTemplateResponse
import org.openapitools.client.models.PostInterestRateChartsRequest
import org.openapitools.client.models.PostInterestRateChartsResponse
import org.openapitools.client.models.PutInterestRateChartsChartIdRequest
import org.openapitools.client.models.PutInterestRateChartsChartIdResponse

interface InterestRateChartApi {
    /**
     * Create a Chart
     * Creates a new chart which can be attached to a term deposit products (FD or RD).
     * Responses:
     *  - 200: OK
     *
     * @param postInterestRateChartsRequest 
     * @return [PostInterestRateChartsResponse]
     */
    @POST("v1/interestratecharts")
    suspend fun create10(@Body postInterestRateChartsRequest: PostInterestRateChartsRequest): Response<PostInterestRateChartsResponse>

    /**
     * Delete a Chart
     * It deletes the chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @return [DeleteInterestRateChartsChartIdResponse]
     */
    @DELETE("v1/interestratecharts/{chartId}")
    suspend fun delete14(@Path("chartId") chartId: kotlin.Long): Response<DeleteInterestRateChartsChartIdResponse>

    /**
     * Retrieve all Charts
     * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param productId productId (optional)
     * @return [kotlin.collections.List<GetInterestRateChartsResponse>]
     */
    @GET("v1/interestratecharts")
    suspend fun retrieveAll26(@Query("productId") productId: kotlin.Long? = null): Response<kotlin.collections.List<GetInterestRateChartsResponse>>

    /**
     * Retrieve a Chart
     * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @return [GetInterestRateChartsResponse]
     */
    @GET("v1/interestratecharts/{chartId}")
    suspend fun retrieveOne17(@Path("chartId") chartId: kotlin.Long): Response<GetInterestRateChartsResponse>

    /**
     * Retrieve Chart Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetInterestRateChartsTemplateResponse]
     */
    @GET("v1/interestratecharts/template")
    suspend fun template9(): Response<GetInterestRateChartsTemplateResponse>

    /**
     * Update a Chart
     * It updates the chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param putInterestRateChartsChartIdRequest 
     * @return [PutInterestRateChartsChartIdResponse]
     */
    @PUT("v1/interestratecharts/{chartId}")
    suspend fun update15(@Path("chartId") chartId: kotlin.Long, @Body putInterestRateChartsChartIdRequest: PutInterestRateChartsChartIdRequest): Response<PutInterestRateChartsChartIdResponse>

}
