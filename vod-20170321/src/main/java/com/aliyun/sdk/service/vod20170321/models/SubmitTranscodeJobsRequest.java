// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTranscodeJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitTranscodeJobsRequest</p>
 */
public class SubmitTranscodeJobsRequest extends Request {
    @Query
    @NameInMap("EncryptConfig")
    private String encryptConfig;

    @Query
    @NameInMap("OverrideParams")
    private String overrideParams;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("TemplateGroupId")
    @Validation(required = true)
    private String templateGroupId;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VideoId")
    private String videoId;

    private SubmitTranscodeJobsRequest(Builder builder) {
        super(builder);
        this.encryptConfig = builder.encryptConfig;
        this.overrideParams = builder.overrideParams;
        this.pipelineId = builder.pipelineId;
        this.priority = builder.priority;
        this.templateGroupId = builder.templateGroupId;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTranscodeJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptConfig
     */
    public String getEncryptConfig() {
        return this.encryptConfig;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitTranscodeJobsRequest, Builder> {
        private String encryptConfig; 
        private String overrideParams; 
        private String pipelineId; 
        private String priority; 
        private String templateGroupId; 
        private String userData; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTranscodeJobsRequest request) {
            super(request);
            this.encryptConfig = request.encryptConfig;
            this.overrideParams = request.overrideParams;
            this.pipelineId = request.pipelineId;
            this.priority = request.priority;
            this.templateGroupId = request.templateGroupId;
            this.userData = request.userData;
            this.videoId = request.videoId;
        } 

        /**
         * The ID of the video.
         * <p>
         * > The VideoId parameter is required.
         */
        public Builder encryptConfig(String encryptConfig) {
            this.putQueryParameter("EncryptConfig", encryptConfig);
            this.encryptConfig = encryptConfig;
            return this;
        }

        /**
         * The transcoding jobs.
         * <p>
         * > This parameter is not returned for HLS packaging tasks. You must asynchronously receive the transcoding result.
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * The priority of the current transcoding job in all queued jobs.
         * <p>
         * *   Valid values: **1** to **10**.
         * *   A value of **10** indicates the highest priority.
         * *   Default value: **6**.
         * > This parameter specifies the priority of only the current transcoding job in all queued jobs and does not affect the priorities of jobs that are running.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * The encryption configurations. The value is a JSON-formatted string. This parameter is required only when HLS encryption is used.
         * <p>
         * > *   In the JSON-formatted string of the [EncryptConfig](~~86952~~) parameter, you must set the **CipherText** parameter to an AES-128 ciphertext key that is generated by calling the [GenerateDataKey](~~28948~~) operation. Otherwise, the transcoding job that uses HLS encryption fails. For more information about how to use HLS encryption, see [HLS encryption](~~68612~~).
         * > *   Regardless of whether HLS encryption or Alibaba Cloud proprietary cryptography is required, you must enable HLS encryption for the template group that is specified by the **TemplateGroupId** parameter. Otherwise, HLS encryption cannot be used.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The parameters used for overriding. The value is a JSON-formatted string. You can set this parameter to override the watermark or subtitle that is associated with the transcoding template. You can override the file URL of an image watermark, the content of a text watermark, the URL of a subtitle file, and the encoding format of a subtitle file. For more information about the data structure, see the "OverrideParams" section of the [Media processing parameters](~~98618~~) topic.
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * The detailed information of the job.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **SubmitTranscodeJobs**.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitTranscodeJobsRequest build() {
            return new SubmitTranscodeJobsRequest(this);
        } 

    } 

}
