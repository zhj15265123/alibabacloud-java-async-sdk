// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomizedVoiceJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomizedVoiceJobResponseBody</p>
 */
public class GetCustomizedVoiceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCustomizedVoiceJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomizedVoiceJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCustomizedVoiceJobResponseBody build() {
            return new GetCustomizedVoiceJobResponseBody(this);
        } 

    } 

    public static class CustomizedVoiceJob extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private String status;

        @NameInMap("VoiceId")
        private String voiceId;

        private CustomizedVoiceJob(Builder builder) {
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.status = builder.status;
            this.voiceId = builder.voiceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedVoiceJob create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        public static final class Builder {
            private String jobId; 
            private String message; 
            private String status; 
            private String voiceId; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            public CustomizedVoiceJob build() {
                return new CustomizedVoiceJob(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CustomizedVoiceJob")
        private CustomizedVoiceJob customizedVoiceJob;

        private Data(Builder builder) {
            this.customizedVoiceJob = builder.customizedVoiceJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizedVoiceJob
         */
        public CustomizedVoiceJob getCustomizedVoiceJob() {
            return this.customizedVoiceJob;
        }

        public static final class Builder {
            private CustomizedVoiceJob customizedVoiceJob; 

            /**
             * CustomizedVoiceJob.
             */
            public Builder customizedVoiceJob(CustomizedVoiceJob customizedVoiceJob) {
                this.customizedVoiceJob = customizedVoiceJob;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
