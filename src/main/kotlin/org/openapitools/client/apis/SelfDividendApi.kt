package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface SelfDividendApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/shareproduct/{productId}/dividend")
    suspend fun createDividendDetail(@Path("productId") productId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param dividendId 
     * @return [kotlin.String]
     */
    @DELETE("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun deleteDividendDetail(@Path("productId") productId: kotlin.Long, @Path("dividendId") dividendId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @param status  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/shareproduct/{productId}/dividend")
    suspend fun retrieveAll39(@Path("productId") productId: kotlin.Long, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null, @Query("status") status: kotlin.Int? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dividendId 
     * @param productId 
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @param accountNo  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun retrieveDividendDetails(@Path("dividendId") dividendId: kotlin.Long, @Path("productId") productId: kotlin.Long, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null, @Query("accountNo") accountNo: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param dividendId 
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun updateDividendDetail(@Path("productId") productId: kotlin.Long, @Path("dividendId") dividendId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Body body: kotlin.String? = null): Response<kotlin.String>

}
