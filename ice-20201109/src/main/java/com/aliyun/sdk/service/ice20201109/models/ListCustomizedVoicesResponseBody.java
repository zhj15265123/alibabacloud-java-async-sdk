// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomizedVoicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomizedVoicesResponseBody</p>
 */
public class ListCustomizedVoicesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCustomizedVoicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomizedVoicesResponseBody create() {
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

        public ListCustomizedVoicesResponseBody build() {
            return new ListCustomizedVoicesResponseBody(this);
        } 

    } 

    public static class CustomizedVoiceList extends TeaModel {
        @NameInMap("DemoAudioMediaId")
        private String demoAudioMediaId;

        @NameInMap("Gender")
        private String gender;

        @NameInMap("Scenario")
        private String scenario;

        @NameInMap("VoiceDesc")
        private String voiceDesc;

        @NameInMap("VoiceId")
        private String voiceId;

        @NameInMap("VoiceName")
        private String voiceName;

        private CustomizedVoiceList(Builder builder) {
            this.demoAudioMediaId = builder.demoAudioMediaId;
            this.gender = builder.gender;
            this.scenario = builder.scenario;
            this.voiceDesc = builder.voiceDesc;
            this.voiceId = builder.voiceId;
            this.voiceName = builder.voiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedVoiceList create() {
            return builder().build();
        }

        /**
         * @return demoAudioMediaId
         */
        public String getDemoAudioMediaId() {
            return this.demoAudioMediaId;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return voiceDesc
         */
        public String getVoiceDesc() {
            return this.voiceDesc;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceName
         */
        public String getVoiceName() {
            return this.voiceName;
        }

        public static final class Builder {
            private String demoAudioMediaId; 
            private String gender; 
            private String scenario; 
            private String voiceDesc; 
            private String voiceId; 
            private String voiceName; 

            /**
             * DemoAudioMediaId.
             */
            public Builder demoAudioMediaId(String demoAudioMediaId) {
                this.demoAudioMediaId = demoAudioMediaId;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * Scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * VoiceDesc.
             */
            public Builder voiceDesc(String voiceDesc) {
                this.voiceDesc = voiceDesc;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * VoiceName.
             */
            public Builder voiceName(String voiceName) {
                this.voiceName = voiceName;
                return this;
            }

            public CustomizedVoiceList build() {
                return new CustomizedVoiceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CustomizedVoiceList")
        private java.util.List < CustomizedVoiceList> customizedVoiceList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.customizedVoiceList = builder.customizedVoiceList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizedVoiceList
         */
        public java.util.List < CustomizedVoiceList> getCustomizedVoiceList() {
            return this.customizedVoiceList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < CustomizedVoiceList> customizedVoiceList; 
            private Integer totalCount; 

            /**
             * CustomizedVoiceList.
             */
            public Builder customizedVoiceList(java.util.List < CustomizedVoiceList> customizedVoiceList) {
                this.customizedVoiceList = customizedVoiceList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
