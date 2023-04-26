// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageRequest</p>
 */
public class DeleteImageRequest extends Request {
    @Query
    @NameInMap("DeleteImageType")
    @Validation(required = true)
    private String deleteImageType;

    @Query
    @NameInMap("ImageIds")
    private String imageIds;

    @Query
    @NameInMap("ImageType")
    private String imageType;

    @Query
    @NameInMap("ImageURLs")
    private String imageURLs;

    @Query
    @NameInMap("VideoId")
    private String videoId;

    private DeleteImageRequest(Builder builder) {
        super(builder);
        this.deleteImageType = builder.deleteImageType;
        this.imageIds = builder.imageIds;
        this.imageType = builder.imageType;
        this.imageURLs = builder.imageURLs;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteImageType
     */
    public String getDeleteImageType() {
        return this.deleteImageType;
    }

    /**
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return imageURLs
     */
    public String getImageURLs() {
        return this.imageURLs;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<DeleteImageRequest, Builder> {
        private String deleteImageType; 
        private String imageIds; 
        private String imageType; 
        private String imageURLs; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageRequest request) {
            super(request);
            this.deleteImageType = request.deleteImageType;
            this.imageIds = request.imageIds;
            this.imageType = request.imageType;
            this.imageURLs = request.imageURLs;
            this.videoId = request.videoId;
        } 

        /**
         * The ID of the request.
         */
        public Builder deleteImageType(String deleteImageType) {
            this.putQueryParameter("DeleteImageType", deleteImageType);
            this.deleteImageType = deleteImageType;
            return this;
        }

        /**
         * The type of the image. This parameter only takes effect when the **DeleteImageType** parameter is set to **VideoId**. In this case, you must set this parameter. Valid values:
         * <p>
         * 
         * *   **CoverSnapshot**: thumbnail snapshot.
         * *   **NormalSnapshot**: normal snapshot.
         * *   **SpriteSnapshot**: sprite snapshot.
         * *   **SpriteOriginSnapshot**: sprite source snapshot.
         * *   **All**: images of all the preceding types. If this parameter is not set to All, you can specify multiple types and separate them with commas (,).
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * ImageType.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DeleteImage**.
         */
        public Builder imageURLs(String imageURLs) {
            this.putQueryParameter("ImageURLs", imageURLs);
            this.imageURLs = imageURLs;
            return this;
        }

        /**
         * Deletes uploaded images and automatic snapshots of videos.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public DeleteImageRequest build() {
            return new DeleteImageRequest(this);
        } 

    } 

}
