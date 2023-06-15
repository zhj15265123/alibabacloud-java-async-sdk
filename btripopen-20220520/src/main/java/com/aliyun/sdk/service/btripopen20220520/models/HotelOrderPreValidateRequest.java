// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderPreValidateRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderPreValidateRequest</p>
 */
public class HotelOrderPreValidateRequest extends Request {
    @Query
    @NameInMap("btrip_user_id")
    @Validation(required = true)
    private String btripUserId;

    @Query
    @NameInMap("check_in")
    @Validation(required = true)
    private String checkIn;

    @Query
    @NameInMap("check_out")
    @Validation(required = true)
    private String checkOut;

    @Query
    @NameInMap("daily_list")
    @Validation(required = true)
    private java.util.List < DailyList> dailyList;

    @Query
    @NameInMap("item_id")
    @Validation(required = true)
    private Long itemId;

    @Query
    @NameInMap("number_of_adults_per_room")
    private Integer numberOfAdultsPerRoom;

    @Query
    @NameInMap("occupant_info_list")
    private java.util.List < OccupantInfoList> occupantInfoList;

    @Query
    @NameInMap("rate_plan_id")
    @Validation(required = true)
    private Long ratePlanId;

    @Query
    @NameInMap("room_id")
    @Validation(required = true)
    private Long roomId;

    @Query
    @NameInMap("room_num")
    @Validation(required = true)
    private Integer roomNum;

    @Query
    @NameInMap("search_room_price")
    @Validation(required = true)
    private Long searchRoomPrice;

    @Query
    @NameInMap("seller_id")
    @Validation(required = true)
    private Long sellerId;

    @Query
    @NameInMap("shid")
    @Validation(required = true)
    private Long shid;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderPreValidateRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
        this.dailyList = builder.dailyList;
        this.itemId = builder.itemId;
        this.numberOfAdultsPerRoom = builder.numberOfAdultsPerRoom;
        this.occupantInfoList = builder.occupantInfoList;
        this.ratePlanId = builder.ratePlanId;
        this.roomId = builder.roomId;
        this.roomNum = builder.roomNum;
        this.searchRoomPrice = builder.searchRoomPrice;
        this.sellerId = builder.sellerId;
        this.shid = builder.shid;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderPreValidateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return checkIn
     */
    public String getCheckIn() {
        return this.checkIn;
    }

    /**
     * @return checkOut
     */
    public String getCheckOut() {
        return this.checkOut;
    }

    /**
     * @return dailyList
     */
    public java.util.List < DailyList> getDailyList() {
        return this.dailyList;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return numberOfAdultsPerRoom
     */
    public Integer getNumberOfAdultsPerRoom() {
        return this.numberOfAdultsPerRoom;
    }

    /**
     * @return occupantInfoList
     */
    public java.util.List < OccupantInfoList> getOccupantInfoList() {
        return this.occupantInfoList;
    }

    /**
     * @return ratePlanId
     */
    public Long getRatePlanId() {
        return this.ratePlanId;
    }

    /**
     * @return roomId
     */
    public Long getRoomId() {
        return this.roomId;
    }

    /**
     * @return roomNum
     */
    public Integer getRoomNum() {
        return this.roomNum;
    }

    /**
     * @return searchRoomPrice
     */
    public Long getSearchRoomPrice() {
        return this.searchRoomPrice;
    }

    /**
     * @return sellerId
     */
    public Long getSellerId() {
        return this.sellerId;
    }

    /**
     * @return shid
     */
    public Long getShid() {
        return this.shid;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelOrderPreValidateRequest, Builder> {
        private String btripUserId; 
        private String checkIn; 
        private String checkOut; 
        private java.util.List < DailyList> dailyList; 
        private Long itemId; 
        private Integer numberOfAdultsPerRoom; 
        private java.util.List < OccupantInfoList> occupantInfoList; 
        private Long ratePlanId; 
        private Long roomId; 
        private Integer roomNum; 
        private Long searchRoomPrice; 
        private Long sellerId; 
        private Long shid; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelOrderPreValidateRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.checkIn = request.checkIn;
            this.checkOut = request.checkOut;
            this.dailyList = request.dailyList;
            this.itemId = request.itemId;
            this.numberOfAdultsPerRoom = request.numberOfAdultsPerRoom;
            this.occupantInfoList = request.occupantInfoList;
            this.ratePlanId = request.ratePlanId;
            this.roomId = request.roomId;
            this.roomNum = request.roomNum;
            this.searchRoomPrice = request.searchRoomPrice;
            this.sellerId = request.sellerId;
            this.shid = request.shid;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putQueryParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * check_in.
         */
        public Builder checkIn(String checkIn) {
            this.putQueryParameter("check_in", checkIn);
            this.checkIn = checkIn;
            return this;
        }

        /**
         * check_out.
         */
        public Builder checkOut(String checkOut) {
            this.putQueryParameter("check_out", checkOut);
            this.checkOut = checkOut;
            return this;
        }

        /**
         * daily_list.
         */
        public Builder dailyList(java.util.List < DailyList> dailyList) {
            String dailyListShrink = shrink(dailyList, "daily_list", "json");
            this.putQueryParameter("daily_list", dailyListShrink);
            this.dailyList = dailyList;
            return this;
        }

        /**
         * item_id.
         */
        public Builder itemId(Long itemId) {
            this.putQueryParameter("item_id", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * number_of_adults_per_room.
         */
        public Builder numberOfAdultsPerRoom(Integer numberOfAdultsPerRoom) {
            this.putQueryParameter("number_of_adults_per_room", numberOfAdultsPerRoom);
            this.numberOfAdultsPerRoom = numberOfAdultsPerRoom;
            return this;
        }

        /**
         * occupant_info_list.
         */
        public Builder occupantInfoList(java.util.List < OccupantInfoList> occupantInfoList) {
            String occupantInfoListShrink = shrink(occupantInfoList, "occupant_info_list", "json");
            this.putQueryParameter("occupant_info_list", occupantInfoListShrink);
            this.occupantInfoList = occupantInfoList;
            return this;
        }

        /**
         * rate_plan_id.
         */
        public Builder ratePlanId(Long ratePlanId) {
            this.putQueryParameter("rate_plan_id", ratePlanId);
            this.ratePlanId = ratePlanId;
            return this;
        }

        /**
         * room_id.
         */
        public Builder roomId(Long roomId) {
            this.putQueryParameter("room_id", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * room_num.
         */
        public Builder roomNum(Integer roomNum) {
            this.putQueryParameter("room_num", roomNum);
            this.roomNum = roomNum;
            return this;
        }

        /**
         * search_room_price.
         */
        public Builder searchRoomPrice(Long searchRoomPrice) {
            this.putQueryParameter("search_room_price", searchRoomPrice);
            this.searchRoomPrice = searchRoomPrice;
            return this;
        }

        /**
         * seller_id.
         */
        public Builder sellerId(Long sellerId) {
            this.putQueryParameter("seller_id", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * shid.
         */
        public Builder shid(Long shid) {
            this.putQueryParameter("shid", shid);
            this.shid = shid;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelOrderPreValidateRequest build() {
            return new HotelOrderPreValidateRequest(this);
        } 

    } 

    public static class DailyList extends TeaModel {
        @NameInMap("board")
        private String board;

        @NameInMap("price")
        private Long price;

        @NameInMap("rate_start_time")
        private String rateStartTime;

        @NameInMap("room_count")
        private Integer roomCount;

        private DailyList(Builder builder) {
            this.board = builder.board;
            this.price = builder.price;
            this.rateStartTime = builder.rateStartTime;
            this.roomCount = builder.roomCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyList create() {
            return builder().build();
        }

        /**
         * @return board
         */
        public String getBoard() {
            return this.board;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return rateStartTime
         */
        public String getRateStartTime() {
            return this.rateStartTime;
        }

        /**
         * @return roomCount
         */
        public Integer getRoomCount() {
            return this.roomCount;
        }

        public static final class Builder {
            private String board; 
            private Long price; 
            private String rateStartTime; 
            private Integer roomCount; 

            /**
             * board.
             */
            public Builder board(String board) {
                this.board = board;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * rate_start_time.
             */
            public Builder rateStartTime(String rateStartTime) {
                this.rateStartTime = rateStartTime;
                return this;
            }

            /**
             * room_count.
             */
            public Builder roomCount(Integer roomCount) {
                this.roomCount = roomCount;
                return this;
            }

            public DailyList build() {
                return new DailyList(this);
            } 

        } 

    }
    public static class OccupantInfoList extends TeaModel {
        @NameInMap("card_no")
        private String cardNo;

        @NameInMap("card_type")
        private Integer cardType;

        @NameInMap("name")
        private String name;

        @NameInMap("phone")
        private String phone;

        @NameInMap("staff_no")
        private String staffNo;

        @NameInMap("user_type")
        private Integer userType;

        private OccupantInfoList(Builder builder) {
            this.cardNo = builder.cardNo;
            this.cardType = builder.cardType;
            this.name = builder.name;
            this.phone = builder.phone;
            this.staffNo = builder.staffNo;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OccupantInfoList create() {
            return builder().build();
        }

        /**
         * @return cardNo
         */
        public String getCardNo() {
            return this.cardNo;
        }

        /**
         * @return cardType
         */
        public Integer getCardType() {
            return this.cardType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return staffNo
         */
        public String getStaffNo() {
            return this.staffNo;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String cardNo; 
            private Integer cardType; 
            private String name; 
            private String phone; 
            private String staffNo; 
            private Integer userType; 

            /**
             * card_no.
             */
            public Builder cardNo(String cardNo) {
                this.cardNo = cardNo;
                return this;
            }

            /**
             * card_type.
             */
            public Builder cardType(Integer cardType) {
                this.cardType = cardType;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * staff_no.
             */
            public Builder staffNo(String staffNo) {
                this.staffNo = staffNo;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public OccupantInfoList build() {
                return new OccupantInfoList(this);
            } 

        } 

    }
}
