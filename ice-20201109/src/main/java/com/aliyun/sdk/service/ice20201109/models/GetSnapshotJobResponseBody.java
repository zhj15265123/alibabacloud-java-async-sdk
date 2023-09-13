// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSnapshotJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotJobResponseBody</p>
 */
public class GetSnapshotJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotJob")
    private SnapshotJob snapshotJob;

    private GetSnapshotJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotJob = builder.snapshotJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotJob
     */
    public SnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static final class Builder {
        private String requestId; 
        private SnapshotJob snapshotJob; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotJob.
         */
        public Builder snapshotJob(SnapshotJob snapshotJob) {
            this.snapshotJob = snapshotJob;
            return this;
        }

        public GetSnapshotJobResponseBody build() {
            return new GetSnapshotJobResponseBody(this);
        } 

    } 

    public static class OssFile extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private OssFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * OSS Bucket
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * OSS Location
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * OSS Object
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public OssFile build() {
                return new OssFile(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @NameInMap("Media")
        private String media;

        @NameInMap("OssFile")
        private OssFile ossFile;

        @NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.ossFile = builder.ossFile;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return ossFile
         */
        public OssFile getOssFile() {
            return this.ossFile;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private OssFile ossFile; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * OssFile.
             */
            public Builder ossFile(OssFile ossFile) {
                this.ossFile = ossFile;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class OutputOssFile extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private OutputOssFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputOssFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * OSS Bucket
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * OSS Location
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * OSS Object
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public OutputOssFile build() {
                return new OutputOssFile(this);
            } 

        } 

    }
    public static class Output extends TeaModel {
        @NameInMap("Media")
        private String media;

        @NameInMap("OssFile")
        private OutputOssFile ossFile;

        @NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.ossFile = builder.ossFile;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return ossFile
         */
        public OutputOssFile getOssFile() {
            return this.ossFile;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private OutputOssFile ossFile; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * OssFile.
             */
            public Builder ossFile(OutputOssFile ossFile) {
                this.ossFile = ossFile;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    public static class SnapshotJob extends TeaModel {
        @NameInMap("Async")
        private Boolean async;

        @NameInMap("Code")
        private String code;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Input")
        private Input input;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Output")
        private Output output;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitTime")
        private String submitTime;

        @NameInMap("TemplateConfig")
        private String templateConfig;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TriggerSource")
        private String triggerSource;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserData")
        private String userData;

        private SnapshotJob(Builder builder) {
            this.async = builder.async;
            this.code = builder.code;
            this.count = builder.count;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.output = builder.output;
            this.pipelineId = builder.pipelineId;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.triggerSource = builder.triggerSource;
            this.type = builder.type;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotJob create() {
            return builder().build();
        }

        /**
         * @return async
         */
        public Boolean getAsync() {
            return this.async;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private Boolean async; 
            private String code; 
            private Integer count; 
            private String createTime; 
            private String finishTime; 
            private Input input; 
            private String jobId; 
            private String message; 
            private String modifiedTime; 
            private String name; 
            private Output output; 
            private String pipelineId; 
            private String status; 
            private String submitTime; 
            private String templateConfig; 
            private String templateId; 
            private String triggerSource; 
            private String type; 
            private String userData; 

            /**
             * Async.
             */
            public Builder async(Boolean async) {
                this.async = async;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
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
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * TemplateConfig.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TriggerSource.
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public SnapshotJob build() {
                return new SnapshotJob(this);
            } 

        } 

    }
}
