package com.winca.music.player;

public abstract interface SystemDef
{
  public static final String ACTION_AUDIO_STATE = "com.winca.audio.STATE";
  public static final String ACTION_AUDIO_STATE_MIX = "audio.mix";
  public static final String ACTION_AUDIO_STATE_MUSIC = "audio.music";
  public static final String ACTION_AUDIO_STATE_OTHER = "audio.other";
  public static final String ACTION_BACK_SEAT_DO_QUERY_STRING = "query";
  public static final String ACTION_BACK_SEAT_DO_SET_STRING = "set";
  public static final String ACTION_BACK_SEAT_DO_STRING = "do";
  public static final String ACTION_BACK_SEAT_VIDEO_REQUEST = "com.winca.backseat.video.request";
  public static final String ACTION_BACK_SEAT_VIDEO_RESPONSE = "com.winca.backseat.video.response";
  public static final String ACTION_LASTMODEL_STATUS_ERROR = "com.winca.system.lastmodel.error";
  public static final String ACTION_LASTMODEL_STATUS_READ = "com.winca.system.lastmodel.read";
  public static final String ACTION_LASTMODEL_STATUS_SAVE = "com.winca.system.lastmodel.save";
  public static final String ACTION_LASTMODEL_STATUS_SAVED = "com.winca.system.lastmodel.saved";
  public static final String ACTION_PLAYER_SET_TITLE = "winca.bluetooth.action.PLAYER_SET_TITLE";
  public static final String ACTION_PLAY_STATUS = "com.winca.playstatus";
  public static final String ACTION_PLAY_STEXT = "com.winca.playtext";
  public static final String ACTION_START_AUX1 = "com.winca.system.start.aux1";
  public static final String ACTION_START_AUX2 = "com.winca.system.start.aux2";
  public static final String ACTION_START_CD = "com.winca.system.start.cd";
  public static final String ACTION_START_CMMB = "com.winca.system.start.cmmb";
  public static final String ACTION_START_DVD = "com.winca.system.start.dvd";
  public static final String ACTION_START_RADIO = "com.winca.system.start.radio";
  public static final String ACTION_START_ROM = "com.winca.system.start.rom";
  public static final String ACTION_START_SDCARD = "com.winca.system.start.sdcard";
  public static final String ACTION_START_USB = "com.winca.system.start.usb";
  public static final String ALBUM_NAME = "music_album_name";
  public static final String ARTIST_NAME = "music_artist_name";
  public static final int AUDIO_CHANNEL_REQUEST = 0;
  public static final String AUDIO_PLAYER_KEY_TYPE = "com.winca.service.audioplayer.KEY_TYPE";
  public static final String AUDIO_PLAYER_KEY_TYPE_ACTION = "com.winca.service.audioplayer.action.KEY_TYPE";
  public static final int AUDIO_PLAYER_KEY_TYPE_NEXT = 2;
  public static final int AUDIO_PLAYER_KEY_TYPE_PAUSE = 4;
  public static final int AUDIO_PLAYER_KEY_TYPE_PREV = 3;
  public static final String AUDIO_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.audio";
  public static final String AUX1_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.aux1";
  public static final int AUX1_VIDEO_CHANNEL_NUM = 3;
  public static final String AUX2_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.aux2";
  public static final int AUX2_VIDEO_CHANNEL_NUM = 4;
  public static final String BLUETOOTH_KEY_TYPE = "com.winca.service.bluetooth.KEY_TYPE";
  public static final String BLUETOOTH_KEY_TYPE_ACTION = "com.winca.service.bluetooth.action.KEY_TYPE";
  public static final int BLUETOOTH_MANAGER_OPERATION = 2;
  public static final int BLUETOOTH_MANAGER_STATUS = 0;
  public static final int BLUETOOTH_MANAGER_STORE = 1;
  public static final int BLUETOOTH_VIEW_ID = 4;
  public static final int BOTH_SEAT_REQUEST = 2;
  public static final String BT_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.bt";
  public static final int CARD_IN = 0;
  public static final int CARD_OUT = 1;
  public static final int CARD_SCAN_FINISHED = 2;
  public static final String CAR_RECORD__NOTIFICATION = "com.winca.service.audiochannel.carrecord";
  public static final String CHANNEL_DESELECTED = "CHANNEL_DESELECTED";
  public static final String CHANNEL_NOTIFICATION = "CHANNEL_NOTIFICATION";
  public static final String CHANNEL_SELECTED = "CHANNEL_SELECTED";
  public static final String CMMB_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.cmmb";
  public static final int CMMB_VIDEO_CHANNEL_NUM = 1;
  public static final int CMMB_VIEW_ID = 3;
  public static final int CONTROLLER_DISC_IN = 1;
  public static final int CONTROLLER_DISC_OUT = 0;
  public static final int CONTROLLER_DISC_READY = 2;
  public static final String CURRENT_MUSIC_TIME = "music_current_time";
  public static final String CURRENT_VIDEO_TIME = "video_current_time";
  public static final String DATA_APP_SCAN_DONE = "data_app_scan_done";
  public static final int DEFAULT_INDEX_FOR_START = 2;
  public static final int DEFAULT_VALUE = -1;
  public static final int DISC_BAD = 0;
  public static final int DISC_EJECT_IN_AUTO = 0;
  public static final int DISC_EJECT_IN_MANUAL = 1;
  public static final int DISC_EJECT_IN_START = 0;
  public static final int DISC_EJECT_IN_STOP = 1;
  public static final int DISC_EJECT_OUT_START = 2;
  public static final int DISC_EJECT_OUT_STOP = 3;
  public static final int DISC_NORMAL = 1;
  public static final int DISC_SOURCE_CFM_CLOSE = 0;
  public static final int DISC_SOURCE_CFM_OPEN = 1;
  public static final int DISC_SUPPORT_FILE_EXIST = 1;
  public static final int DISC_SUPPORT_FILE_NOEXIST = 0;
  public static final int DISC_TYPE_CD = 2;
  public static final int DISC_TYPE_DVD = 0;
  public static final int DISC_TYPE_ROM = 3;
  public static final int DISC_TYPE_UNKNOWN = 7;
  public static final int DISC_TYPE_UPDATE = 15;
  public static final int DISC_TYPE_VCD = 1;
  public static final String DVR_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.dvr";
  public static final String EXTRA_LASTMODEL_ERROR_TYPE = "com.winca.lastmodel.error.type";
  public static final String EXTRA_PLAYER_SET_DETAIL = "android.bluetooth.extra.PLAYER_SET_DETAIL";
  public static final String EXTRA_PLAYER_SET_TITLE = "android.bluetooth.extra.PLAYER_SET_TITLE";
  public static final int FM_VIEW_ID = 2;
  public static final int FRONT_SEAT_REQUEST = 0;
  public static final String FULL_SCREEN_MENU_ACTION = "FULL_SCREEN_MENU_ACTION";
  public static final int GPS_VIEW_ID = 1;
  public static final String HAND_BREAK_ACTION = "com.winca.audiochannelmanager.handbreak";
  public static final String HAND_BREAK_ACTION_EXTRA = "com.winca.audiochannelmanager.handbreak.extra";
  public static final int HOME_VIEW_ID = 0;
  public static final int INCLUDE_DRM_IMAGES = 2;
  public static final int INCLUDE_IMAGES = 1;
  public static final int INCLUDE_VIDEOS = 4;
  public static final String IPOD_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.ipod";
  public static final int KEY_VALUE_BOTTOM = 17;
  public static final int KEY_VALUE_LEFT = 14;
  public static final int KEY_VALUE_RIGHT = 15;
  public static final int KEY_VALUE_UP = 16;
  public static final int LAST = 3;
  public static final int LASTMODEL_ERROR_TYPE_NOMPEG = 2;
  public static final int LASTMODEL_ERROR_TYPE_NONE = 0;
  public static final int LASTMODEL_ERROR_TYPE_NOSDCARD = 1;
  public static final int LASTMODEL_ERROR_TYPE_NOUSB = 3;
  public static final String LASTMODEL_STATUS_ERROR = "com.winca.lastmodel.error";
  public static final int LASTMODEL_STATUS_ERROR_INT = 1;
  public static final int LASTMODEL_STATUS_NONE = -1;
  public static final String LASTMODEL_STATUS_READ = "com.winca.lastmodel.read";
  public static final String LASTMODEL_STATUS_SAVE = "com.winca.lastmodel.save";
  public static final String LASTMODEL_STATUS_SAVED = "com.winca.lastmodel.saved";
  public static final int LASTMODEL_STATUS_SAVED_INT = 0;
  public static final int LASTMODE_TYPE_BLUETOOTH = 1;
  public static final int LASTMODE_TYPE_NONE = -1;
  public static final int LASTMODE_TYPE_REBOOT = 0;
  public static final int LIST_VIEW_ALBUM = 2;
  public static final int LIST_VIEW_ALBUM_TRACK = 6;
  public static final int LIST_VIEW_ALL = 0;
  public static final int LIST_VIEW_ARTIST = 3;
  public static final int LIST_VIEW_CURR = 4;
  public static final int LIST_VIEW_FILE = 5;
  public static final int LIST_VIEW_FOLDER = 1;
  public static final int LOCAL_MEPG_PLAYER_POS = 1;
  public static final int LOCAL_SDMUSIC_PLAYER_POS = 0;
  public static final int LOCAL_USBMUSIC_PLAYER_POS = 2;
  public static final int MCU_CHANNEL_APP = 14;
  public static final int MCU_CHANNEL_AUX1 = 5;
  public static final int MCU_CHANNEL_AUX2 = 6;
  public static final int MCU_CHANNEL_BT = 4;
  public static final int MCU_CHANNEL_CAMARA_LENS = 11;
  public static final int MCU_CHANNEL_CAR_RECORD = 15;
  public static final int MCU_CHANNEL_CMMB = 10;
  public static final int MCU_CHANNEL_DVD = 2;
  public static final int MCU_CHANNEL_FM = 1;
  public static final int MCU_CHANNEL_IPOD = 12;
  public static final int MCU_CHANNEL_MPUAUDIO = 8;
  public static final int MCU_CHANNEL_MPUVIDIO = 7;
  public static final int MCU_CHANNEL_NAVI = 3;
  public static final int MCU_CHANNEL_VIDEORECORD = 13;
  public static final int MCU_CHANNEL_VIRTUALDISCBOX = 9;
  public static final int MCU_MENU_APP = 15;
  public static final int MCU_MENU_AUDIOPLAY = 13;
  public static final int MCU_MENU_AUDIO_SETTING = 24;
  public static final int MCU_MENU_AUX1 = 8;
  public static final int MCU_MENU_AUX2 = 9;
  public static final int MCU_MENU_BT = 3;
  public static final int MCU_MENU_CAM = 10;
  public static final int MCU_MENU_CAR_INFO = 29;
  public static final int MCU_MENU_CAR_RECORD = 26;
  public static final int MCU_MENU_CD = 5;
  public static final int MCU_MENU_DVD = 4;
  public static final int MCU_MENU_DVR = 14;
  public static final int MCU_MENU_ENGINEER_MODE = 28;
  public static final int MCU_MENU_FORCED_BACKCAR = 18;
  public static final int MCU_MENU_HANDBRAKE = 22;
  public static final int MCU_MENU_INFO_VIEW = 30;
  public static final int MCU_MENU_IPOD = 11;
  public static final int MCU_MENU_NAVI = 21;
  public static final int MCU_MENU_NAVI_PIP = 27;
  public static final int MCU_MENU_NOSIGNAL = 19;
  public static final int MCU_MENU_NULL = 255;
  public static final int MCU_MENU_OPENLOGO = 20;
  public static final int MCU_MENU_POWWEROFF = 25;
  public static final int MCU_MENU_RADIO = 2;
  public static final int MCU_MENU_SETUP = 16;
  public static final int MCU_MENU_SRC = 1;
  public static final int MCU_MENU_STUDY_SWC = 23;
  public static final int MCU_MENU_TV = 7;
  public static final int MCU_MENU_VCDC = 6;
  public static final int MCU_MENU_VIDEOPLAY = 12;
  public static final int MCU_MENU_VIDEOSETUP = 17;
  public static final int MEDIA_AO_EXIST = 0;
  public static final int MEDIA_AP_EXIST = 5;
  public static final int MEDIA_AVP_EXIST = 6;
  public static final int MEDIA_AV_EXIST = 3;
  public static final String MEDIA_EXTERNAL_EXTSD = "external_extsd";
  public static final String MEDIA_EXTERNAL_SD = "external";
  public static final String MEDIA_EXTERNAL_UDISK = "external_udisk";
  public static final String MEDIA_META_CHANGED = "com.winca.multiplayer.music.metachanged";
  public static final int MEDIA_MODE_LIST = 1;
  public static final int MEDIA_MODE_PLAYER = 0;
  public static final int MEDIA_NONE_EXIST = 7;
  public static final String MEDIA_PLAY_CHANGE = "com.winca.multiplayer.media.play.change";
  public static final int MEDIA_PLAY_CHANGE_NEXT = 4;
  public static final int MEDIA_PLAY_CHANGE_NONE = 0;
  public static final int MEDIA_PLAY_CHANGE_PAUSE = 2;
  public static final int MEDIA_PLAY_CHANGE_PLAY = 1;
  public static final int MEDIA_PLAY_CHANGE_PREVIOUS = 3;
  public static final int MEDIA_PLAY_CHANGE_STOP = 5;
  public static final int MEDIA_PO_EXIST = 2;
  public static final int MEDIA_TYPE_AUDIO = 0;
  public static final int MEDIA_TYPE_NONE = -1;
  public static final int MEDIA_TYPE_PHOTO = 2;
  public static final int MEDIA_TYPE_VIDEO = 1;
  public static final int MEDIA_VO_EXIST = 1;
  public static final int MEDIA_VP_EXIST = 4;
  public static final int MPEG_AUDIO_CHANNEL_2_1 = 2;
  public static final int MPEG_AUDIO_CHANNEL_5_1 = 5;
  public static final int MPEG_AUDIO_CHANNEL_DIVX_TYPE = 64;
  public static final int MPEG_AUDIO_CHANNEL_DOLBY = 5;
  public static final int MPEG_AUDIO_CHANNEL_DTS = 3;
  public static final int MPEG_AUDIO_CHANNEL_DVD_TYPE = 128;
  public static final int MPEG_AUDIO_CHANNEL_LPCM = 2;
  public static final int MPEG_AUDIO_CHANNEL_MP3 = 4;
  public static final int MPEG_AUDIO_CHANNEL_MPEG = 1;
  public static final int MPEG_AUDIO_CHANNEL_NONE = 0;
  public static final int MPEG_AUDIO_CHANNEL_NO_TYPE = 0;
  public static final int MPEG_AUDIO_CHANNEL_VCD_LEFT_TYPE = 2;
  public static final int MPEG_AUDIO_CHANNEL_VCD_MIX_TYPE = 4;
  public static final int MPEG_AUDIO_CHANNEL_VCD_RIGHT_TYPE = 3;
  public static final int MPEG_AUDIO_CHANNEL_VCD_STERO_TYPE = 1;
  public static final int MPEG_DEFAULT_VALUE = -3;
  public static final int MPEG_ID3_COVER = 20;
  public static final int MPEG_ID3_MP3_ALBUM = 2;
  public static final int MPEG_ID3_MP3_ARTIST = 1;
  public static final int MPEG_ID3_MP3_COMMENT = 6;
  public static final int MPEG_ID3_MP3_GENRE = 5;
  public static final int MPEG_ID3_MP3_NAME = 0;
  public static final int MPEG_ID3_MP3_TRACKNUM = 4;
  public static final int MPEG_ID3_MP3_YEAR = 3;
  public static final int MPEG_ID3_WMA_ARTIST = 17;
  public static final int MPEG_ID3_WMA_COPYRIGHT = 18;
  public static final int MPEG_ID3_WMA_DESCRIPTION = 19;
  public static final int MPEG_ID3_WMA_TITLE = 16;
  public static final int MPEG_LANG_INDEX_CHINESE = 2;
  public static final int MPEG_LANG_INDEX_CZECH = 11;
  public static final int MPEG_LANG_INDEX_DANISH = 17;
  public static final int MPEG_LANG_INDEX_DUTCH = 15;
  public static final int MPEG_LANG_INDEX_ENGLISH = 1;
  public static final int MPEG_LANG_INDEX_FINISH = 19;
  public static final int MPEG_LANG_INDEX_FRENCH = 5;
  public static final int MPEG_LANG_INDEX_GERMAN = 7;
  public static final int MPEG_LANG_INDEX_GREEK = 20;
  public static final int MPEG_LANG_INDEX_HINDI = 14;
  public static final int MPEG_LANG_INDEX_HUNGARIAN = 12;
  public static final int MPEG_LANG_INDEX_ICELANDIC = 13;
  public static final int MPEG_LANG_INDEX_ITALIAN = 24;
  public static final int MPEG_LANG_INDEX_JAPANESE = 4;
  public static final int MPEG_LANG_INDEX_KOREAN = 22;
  public static final int MPEG_LANG_INDEX_LATIN = 8;
  public static final int MPEG_LANG_INDEX_NORWEGIAN = 21;
  public static final int MPEG_LANG_INDEX_NULL = 0;
  public static final int MPEG_LANG_INDEX_POLISH = 10;
  public static final int MPEG_LANG_INDEX_PORTUGUESE = 6;
  public static final int MPEG_LANG_INDEX_RUSSIAN = 3;
  public static final int MPEG_LANG_INDEX_SPANISH = 9;
  public static final int MPEG_LANG_INDEX_SWEDISH = 18;
  public static final int MPEG_LANG_INDEX_THAI = 23;
  public static final int MPEG_LANG_INDEX_TURKISH = 16;
  public static final int MPEG_PLAYLIST_AUDIO_FILE = 1;
  public static final int MPEG_PLAYLIST_AUDIO_FOLDER = 0;
  public static final int MPEG_PLAYLIST_PHOTO_FILE = 5;
  public static final int MPEG_PLAYLIST_PHOTO_FOLDER = 4;
  public static final int MPEG_PLAYLIST_VIDEO_FILE = 3;
  public static final int MPEG_PLAYLIST_VIDEO_FOLDER = 2;
  public static final String MPEG_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.mpeg";
  public static final String MPEG_SERVICE = "com.winca.service.mpegNotification";
  public static final int MPEG_UPDATA_MODE_ENTER = 64;
  public static final int MPEG_UPDATA_MODE_EXIT = 65;
  public static final int MPEG_UPDATA_MODE_START = 66;
  public static final String MPEG_VCDC_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.mpeg.vcdc";
  public static final int MPEG_VIDEO_CHANNEL_NUM = 0;
  public static final int MPEG_VIDEO_CLOSE = 0;
  public static final int MPEG_VIDEO_OPEN = 1;
  public static final int MPEG_VIEW_ID = 6;
  public static final int MPU_VIDEO_CHANNEL_NUM = 5;
  public static final int MSG_TIP_ANGLE = 32;
  public static final int MSG_TIP_CD_RIP_ENABLE = 31;
  public static final int MSG_TIP_FB_X2 = 22;
  public static final int MSG_TIP_FB_X20 = 25;
  public static final int MSG_TIP_FB_X4 = 23;
  public static final int MSG_TIP_FB_X8 = 24;
  public static final int MSG_TIP_FF_X2 = 18;
  public static final int MSG_TIP_FF_X20 = 21;
  public static final int MSG_TIP_FF_X4 = 19;
  public static final int MSG_TIP_FF_X8 = 20;
  public static final int MSG_TIP_INVALID = 1;
  public static final int MSG_TIP_JPEG_ZOOM_1_3 = 33;
  public static final int MSG_TIP_JPEG_ZOOM_2_0 = 34;
  public static final int MSG_TIP_JPEG_ZOOM_RESET = 35;
  public static final int MSG_TIP_NEXT = 2;
  public static final int MSG_TIP_PAUSE = 4;
  public static final int MSG_TIP_PBC_OFF = 30;
  public static final int MSG_TIP_PBC_ON = 29;
  public static final int MSG_TIP_PLAY = 6;
  public static final int MSG_TIP_PREV = 3;
  public static final int MSG_TIP_REPEAT_A = 26;
  public static final int MSG_TIP_REPEAT_AB = 27;
  public static final int MSG_TIP_REPEAT_AB_OFF = 28;
  public static final int MSG_TIP_REPEAT_ALL = 9;
  public static final int MSG_TIP_REPEAT_CHAPTER = 8;
  public static final int MSG_TIP_REPEAT_FOLDER = 11;
  public static final int MSG_TIP_REPEAT_OFF = 12;
  public static final int MSG_TIP_REPEAT_TITLE = 7;
  public static final int MSG_TIP_REPEAT_TRACK = 10;
  public static final int MSG_TIP_RESUME = 0;
  public static final int MSG_TIP_ROTATE_LEFT = 36;
  public static final int MSG_TIP_ROTATE_RIGHT = 37;
  public static final int MSG_TIP_SCAN_OFF = 16;
  public static final int MSG_TIP_SCAN_ON = 15;
  public static final int MSG_TIP_SHUFFLE_OFF = 14;
  public static final int MSG_TIP_SHUFFLE_ON = 13;
  public static final int MSG_TIP_STOP = 5;
  public static final int MSG_TIP_ZOOM = 17;
  public static final int NEXT = 2;
  public static final int NORMAL_STATE = 0;
  public static final int NOTIFIY_TYPE_DISC_DEVICE = 0;
  public static final int NOTIFIY_TYPE_DISC_INFO = 1;
  public static final int NOTIFIY_TYPE_MISC = 3;
  public static final int NOTIFIY_TYPE_PLAY_STATUS = 2;
  public static final int NOTIFIY_TYPE_UNKNOWN = 4;
  public static final int NOTIFY_CANCEL = 2;
  public static final int NOTIFY_CAN_CLEAR = 0;
  public static final String NOTIFY_MODE = "notify_mode";
  public static final int NOTIFY_NO_CLEAR = 1;
  public static final String NOTIFY_STATUS_ACTION = "notify_status_action";
  public static final int NOTIFY_VALUE_UNKOWN = 65535;
  public static final int NOW = 1;
  public static final String PAUSE_STRING = "��ͣ״̬";
  public static final int PLAYBACKSERVICE_STATUS = 1;
  public static final int PLAYER_MAX = 3;
  public static final String PLAYING_STRING = "���ڲ���";
  public static final int PLAY_REPEAT_ALL = 3;
  public static final int PLAY_REPEAT_CHAPTER = 5;
  public static final int PLAY_REPEAT_FOLDER = 2;
  public static final int PLAY_REPEAT_OFF = 0;
  public static final int PLAY_REPEAT_ONE = 1;
  public static final int PLAY_REPEAT_TITLE = 4;
  public static final int PLAY_ROOTMENU_IN = 1;
  public static final int PLAY_ROOTMENU_OUT = 0;
  public static final int PLAY_SHUFFLE_OFF = 0;
  public static final int PLAY_SHUFFLE_ON = 1;
  public static final int PLAY_STATUS_BACKWARD_20X = 13;
  public static final int PLAY_STATUS_BACKWARD_2X = 10;
  public static final int PLAY_STATUS_BACKWARD_4X = 11;
  public static final int PLAY_STATUS_BACKWARD_8X = 12;
  public static final int PLAY_STATUS_BACKWARD_OFF = 9;
  public static final int PLAY_STATUS_FORWARD_20X = 8;
  public static final int PLAY_STATUS_FORWARD_2X = 5;
  public static final int PLAY_STATUS_FORWARD_4X = 6;
  public static final int PLAY_STATUS_FORWARD_8X = 7;
  public static final int PLAY_STATUS_FORWARD_OFF = 4;
  public static final int PLAY_STATUS_LOADING = 14;
  public static final int PLAY_STATUS_PAUSE = 1;
  public static final int PLAY_STATUS_PLAY = 0;
  public static final int PLAY_STATUS_PRE_STOP = 2;
  public static final int PLAY_STATUS_STOP = 3;
  public static final int PLAY_TYPE_AUDIO = 0;
  public static final int PLAY_TYPE_PHOTO = 2;
  public static final int PLAY_TYPE_VIDEO = 1;
  public static final String RADIO_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.radio";
  public static final int REARCAM_VIDEO_CHANNEL_NUM = 2;
  public static final int REAR_SEAT_REQUEST = 1;
  public static final int REPEAT_ALL = 2;
  public static final int REPEAT_CURRENT = 1;
  public static final int REPEAT_NONE = 0;
  public static final int ROM_TYPE_AUDIO = 1;
  public static final int ROM_TYPE_PHOTO = 2;
  public static final int ROM_TYPE_VIDEO = 3;
  public static final int RUNNING_SELECTED_STATE = 3;
  public static final int RUNNING_STATE = 1;
  public static final String SAVE_CHANNEL_MENU_ACTION = "com.winca.audiochannelmanager.SAVE_CHANNEL_MENU_ACTION";
  public static final String SAVE_CHANNEL_MENU_EXTRA = "com.winca.audiochannelmanager.SAVE_CHANNEL_MENU_EXTRA";
  public static final String SD_MEDIA_TYPE = "sd_media_type";
  public static final int SD_VIEW_ID = 7;
  public static final int SELECTED_STATE = 2;
  public static final String SERVICE_AUX_READY = "service_aux_radio";
  public static final String SERVICE_AUX_STATUS = "com.winca.service.aux";
  public static final String SERVICE_BT_READY = "bt_service_ready";
  public static final String SERVICE_BT_STATUS = "com.winca.service.bt";
  public static final String SERVICE_CHANGED = "com.winca.service.change";
  public static final String SERVICE_DVR_READY = "service_videorecorder";
  public static final String SERVICE_DVR_STATUS = "com.winca.service.videorecorder";
  public static final int SERVICE_INTERFACE_AUDIOCONTROL = 1;
  public static final int SERVICE_INTERFACE_AUX = 6;
  public static final int SERVICE_INTERFACE_BLUETOOTH = 3;
  public static final int SERVICE_INTERFACE_DVR = 9;
  public static final int SERVICE_INTERFACE_IPOD = 8;
  public static final int SERVICE_INTERFACE_MAX = 10;
  public static final int SERVICE_INTERFACE_MISC = 4;
  public static final int SERVICE_INTERFACE_MULTIPLAYER = 0;
  public static final int SERVICE_INTERFACE_NONE = -1;
  public static final int SERVICE_INTERFACE_RADIO = 2;
  public static final int SERVICE_INTERFACE_SETTING = 7;
  public static final int SERVICE_INTERFACE_TV = 5;
  public static final String SERVICE_IPETRONIK_READY = "service_ipetronik";
  public static final String SERVICE_IPETRONIK_STATUS = "com.winca.service.ipetronik";
  public static final String SERVICE_IPOD_READY = "service_ready_ipod";
  public static final String SERVICE_IPOD_STATUS = "com.winca.service.ipod";
  public static final String SERVICE_MPEG_READY = "service_ready_mpeg";
  public static final String SERVICE_MPEG_STATUS = "com.winca.service.mpeg";
  public static final String SERVICE_RADIO_READY = "service_ready_radio";
  public static final String SERVICE_RADIO_STATUS = "com.winca.service.radio";
  public static final String SERVICE_STATUS = "com.winca.service.status";
  public static final String SERVICE_STATUS_ALLCONNECTED = "com.winca.service.status.allconnected";
  public static final String SERVICE_STATUS_QUERY = "com.winca.service.status.query";
  public static final String SERVICE_TV_READY = "service_tv_radio";
  public static final String SERVICE_TV_STATUS = "com.winca.service.tv";
  public static final String SERVICE_VOLUMEMANAGER_READY = "service_ready_volumemanager";
  public static final String SERVICE_VOLUMEMANAGER_STATUS = "com.winca.service.volumemanager";
  public static final int SETTING_MANAGER_OPERATION = 5;
  public static final int SETTING_MANAGER_STATUS = 3;
  public static final int SETTING_MANAGER_STORE = 4;
  public static final int SETTING_VIEW_ID = 5;
  public static final int SHUFFLE_AUTO = 2;
  public static final int SHUFFLE_NONE = 0;
  public static final int SHUFFLE_NORMAL = 1;
  public static final int SHUFFLE_ON = 1;
  public static final int SORT_ASCENDING = 1;
  public static final int SORT_DESCENDING = 2;
  public static final String SOURCETYP_IS_IN_CURRENT = "source_type_is_in_current_page";
  public static final int SOURCE_CAR_RECORD = 17;
  public static final int SOURCE_TYPE_3GPHONE = 11;
  public static final int SOURCE_TYPE_APP = 18;
  public static final int SOURCE_TYPE_AUDIO = 19;
  public static final int SOURCE_TYPE_AUX1 = 4;
  public static final int SOURCE_TYPE_AUX2 = 5;
  public static final int SOURCE_TYPE_BACK = 14;
  public static final int SOURCE_TYPE_BT = 7;
  public static final int SOURCE_TYPE_BTA2DP = 7;
  public static final int SOURCE_TYPE_BTPHONE = 10;
  public static final int SOURCE_TYPE_CMMB = 8;
  public static final int SOURCE_TYPE_DEFAULT = -1;
  public static final int SOURCE_TYPE_DVR = 16;
  public static final int SOURCE_TYPE_FM = 3;
  public static final int SOURCE_TYPE_IPOD = 6;
  public static final int SOURCE_TYPE_MPEG = 0;
  public static final int SOURCE_TYPE_MPU = 13;
  public static final int SOURCE_TYPE_NAVI = 21;
  public static final int SOURCE_TYPE_REARCAMERA = 9;
  public static final int SOURCE_TYPE_SD = 1;
  public static final int SOURCE_TYPE_SHELL = 12;
  public static final int SOURCE_TYPE_USB = 2;
  public static final int SOURCE_TYPE_VCDC = 15;
  public static final int SOURCE_TYPE_VIDEO = 20;
  public static final String SPARAM_LASTMODEL_TYPE = "com.winca.system.lastmodel.type";
  public static final String SPARAM_PASS_VIEW_ID = "VIEWID";
  public static final String SPARAM_PLAY_CHANGE_CMD = "com.winca.multiplayer.media.play.change.command";
  public static final String SPARAM_PLAY_STATUS = "play_status";
  public static final String SPARAM_PLAY_TEXT = "play_text";
  public static final String SPARAM_PLAY_TYPE = "play_type";
  public static final String SPARAM_SERVICE_SOURCE = "com.winca.service.source";
  public static final String SPARAM_SERVICE_STATUS = "com.winca.service.status";
  public static final String SPARAM_SERVICE_STATUS_ALL = "com.winca.service.status.all";
  public static final String SPARAM_SERVICE_STATUS_AUDIOCONTROL = "com.winca.service.status.audiocontrol";
  public static final String SPARAM_SERVICE_STATUS_BLUETOOTH = "com.winca.service.status.bluetooth";
  public static final String SPARAM_SERVICE_STATUS_MISC = "com.winca.service.status.misc";
  public static final String SPARAM_SERVICE_STATUS_MULTIPLAYER = "com.winca.service.status.multiplayer";
  public static final String SPARAM_SERVICE_STATUS_RADIO = "com.winca.service.status.radio";
  public static final String SPARAM_SOURCE_TYPE = "source_type";
  public static final String SPARAM_STORAGE_MEDIATYPE = "com.winca.storage.media_type";
  public static final String SPARAM_STORAGE_SOURCE = "source_type";
  public static final String SPARAM_STORAGE_STATUS = "com.winca.storage.status";
  public static final String START_THIRD_PARTY_APP_ACTION = "com.winca.audiochannelmanager.START_THIRD_PARTY_APP_ACTION";
  public static final String START_THIRD_PARTY_APP_ACTION_EXTRA = "com.winca.audiochannelmanager.START_THIRD_PARTY_APP_EXTRA";
  public static final String STORAGE_STATUS_CHANGE = "com.winca.storage.status.change";
  public static final int STORAGE_STATUS_EJECT = 3;
  public static final int STORAGE_STATUS_INJECT = 2;
  public static final int STORAGE_STATUS_MOUNTED = 6;
  public static final int STORAGE_STATUS_NONE = 0;
  public static final String STORAGE_STATUS_QUERY = "com.winca.storage.status.query";
  public static final int STORAGE_STATUS_QUERYDONE = 4;
  public static final int STORAGE_STATUS_RESIDENT = 1;
  public static final int STORAGE_STATUS_SCANDONE = 5;
  public static final int STORAGE_TYPE_MAX = 3;
  public static final int STORAGE_TYPE_MPEG = 0;
  public static final int STORAGE_TYPE_NONE = -1;
  public static final int STORAGE_TYPE_SDCARD = 1;
  public static final int STORAGE_TYPE_UDISK = 2;
  public static final int SUBTITLE_SHOW_MODE_ALL = 2;
  public static final int SUBTITLE_SHOW_MODE_OFF = 0;
  public static final int SUBTITLE_SHOW_MODE_SIMPLE = 1;
  public static final String SUB_MENU_NOSIGNAL = "com.winca.audiochannelmanager.nosignal";
  public static final String SUB_MENU_NOSIGNAL_EXTRA = "com.winca.audiochannelmanager.nosignal.extra";
  public static final String SWITCH_SOURCETYPE_ACTION = "com.winca.audiochannelmanager.switchsource";
  public static final int SYSTEM_REBOOT_TYPE_NONE = 0;
  public static final int SYSTEM_REBOOT_TYPE_SERVICE_BINDERROR = 2;
  public static final int SYSTEM_REBOOT_TYPE_SERVICE_DISCONNECT = 5;
  public static final int SYSTEM_REBOOT_TYPE_SERVICE_NOTREADY = 6;
  public static final int SYSTEM_REBOOT_TYPE_SERVICE_NOTRUN = 1;
  public static final int SYSTEM_REBOOT_TYPE_TEST = -1;
  public static final int SYSTEM_REBOOT_TYPE_THREAD_EXCEPTION = 4;
  public static final int SYSTEM_REBOOT_TYPE_TRICYCLEUI_NEWERROR = 3;
  public static final String SYSTEM_SHUT_DOWN_START = "com.winca.shutdown_start";
  public static final String SYSTEM_UPDATE_DATETIME = "com.winca.update.datetime";
  public static final String S_AUDIO_CHANNEL_ENV = "D_AUDIO_CHANNEL_ENV";
  public static final String S_AUDIO_CHANNEL_LANG_ID = "D_AUDIO_CHANNEL_LANG_ID";
  public static final String S_AUDIO_CHANNEL_MODE = "D_AUDIO_CHANNEL_MODE";
  public static final String S_AUDIO_CHANNEL_TYPE = "D_AUDIO_CHANNEL_TYPE";
  public static final String S_AUDIO_CURRENT_AUDIO_CHANNEL = "D_AUDIO_CHANNELD_CURRENT";
  public static final String S_AUDIO_TOTAL_AUDIO_CHANNEL = "D_AUDIO_CHANNELD_TOTAL";
  public static final String S_DISC_BAD_STATE = "D_BADDISC_NOTIFIY";
  public static final String S_DISC_EJECT_ACTION = "D_EJECT_ACTION_NOTIFIY";
  public static final String S_DISC_EJECT_STATE = "D_EJECT_NOTIFIY";
  public static final String S_DISC_SUPPORT_STATE = "D_SUPPORT_NOTIFIY";
  public static final String S_DISC_TYPE_STATE = "D_TYPE_NOTIFIY";
  public static final String S_MPEG_TIP = "I_MPEG_TIP_NOTIFY";
  public static final String S_MPEG_UPDATE_STATUS = "D_MPEG_UPDATE_STATUS";
  public static final String S_MPEG_VIDEO_MODE_REQ = "D_MPEG_VIDEO_MODE_REQ";
  public static final String S_PLAYLIST_REPORT_FILEDIR_NUMBER = "D_PLAYLIST_FILEDIR_NUMBER";
  public static final String S_PLAYLIST_REPORT_FOLDER = "D_PLAYLIST_FOLER";
  public static final String S_PLAYLIST_REPORT_MODE = "D_PLAYLIST_MODE";
  public static final String S_PLAYLIST_REPORT_NUMBER = "D_PLAYLIST_NUMBER";
  public static final String S_PLAYLIST_REPORT_PARENT_INDEX = "D_PLAYLIST_PARENT_INDEX";
  public static final String S_PLAYLIST_REPORT_RECORD_INDEX_1 = "D_PLAYLIST_RECORD_INDEX_1";
  public static final String S_PLAYLIST_REPORT_RECORD_INDEX_2 = "D_PLAYLIST_RECORD_INDEX_2";
  public static final String S_PLAYLIST_REPORT_RECORD_INDEX_3 = "D_PLAYLIST_RECORD_INDEX_3";
  public static final String S_PLAYLIST_REPORT_RECORD_INDEX_4 = "D_PLAYLIST_RECORD_INDEX_4";
  public static final String S_PLAYLIST_REPORT_RECORD_INDEX_5 = "D_PLAYLIST_RECORD_INDEX_5";
  public static final String S_PLAYLIST_REPORT_RECORD_INDEX_6 = "D_PLAYLIST_RECORD_INDEX_6";
  public static final String S_PLAYLIST_REPORT_TYPE = "D_PLAYLIST_TYPE";
  public static final String S_PLAY_CURR_TIME = "P_TRACK_PLAY_CURR_TIME";
  public static final String S_PLAY_DVD_RMENU = "I_DVD_RMENU_NOTIFY";
  public static final String S_PLAY_INFO_DVD_CHAPT_CURRENT = "P_TRACKDVDCHAPT_CURR_NOTIFY";
  public static final String S_PLAY_INFO_DVD_CHAPT_TOTAL = "I_TRACKDVDCHAPT_ALL_NOTIFY";
  public static final String S_PLAY_INFO_DVD_TITLE_CURRENT = "P_TRACKDVDTITLE_CURR_NOTIFY";
  public static final String S_PLAY_INFO_DVD_TITLE_TOTAL = "I_TRACKDVDTITLE_ALL_NOTIFY";
  public static final String S_PLAY_INFO_ROM_CURRENT_DIRINDEX = "P_ROMPLAY_CURRENT_DIRINDEX";
  public static final String S_PLAY_INFO_ROM_CURRENT_TYPE = "P_ROMPLAY_CURRENT_TYPE";
  public static final String S_PLAY_INFO_TRACK_CURRENT = "P_TRACKCUR_NOTIFY";
  public static final String S_PLAY_INFO_TRACK_TOTAL = "I_TRACKALL_NOTIFY";
  public static final String S_PLAY_REPEAT_STATE = "PLAY_REPEAT_NOTIFY";
  public static final String S_PLAY_SHUFFLE_STATE = "PLAY_SHUFFLE_NOTIFY";
  public static final String S_PLAY_STATE = "PLAY_STATE_NOTIFY";
  public static final String S_PLAY_TIME = "I_DVD_PLAYTIME_NOTIFY";
  public static final String S_PLAY_TOTAL_TIME = "P_TRACK_PLAY_TOTAL_TIME";
  public static final String S_ROMMEDIA_ID3_CURRENT_INDEX = "D_ROMMEDIA_ID3_CURRENT_INDEX";
  public static final String S_ROMMEDIA_ID3_CURRENT_PARENT_DIR = "D_ROMMEDIA_ID3_CURRENT_PARENT_DIR";
  public static final String S_ROMMEDIA_ID3_TYPE = "D_ROMMEDIA_ID3_TYPE";
  public static final String S_ROMMEDIA_MUSIC_DIR_NUMBER = "D_ROMMEDIA_MUSIC_DIR_NUMBER";
  public static final String S_ROMMEDIA_MUSIC_FILE_NUMBER = "D_ROMMEDIA_MUSIC_FILE_NUMBER";
  public static final String S_ROMMEDIA_PHOTO_DIR_NUMBER = "D_ROMMEDIA_PHOTO_DIR_NUMBER";
  public static final String S_ROMMEDIA_PHOTO_FILE_NUMBER = "D_ROMMEDIA_PHOTO_FILE_NUMBER";
  public static final String S_ROMMEDIA_QUERY_DONE = "D_QUERY_FINISH";
  public static final String S_ROMMEDIA_VIDEO_DIR_NUMBER = "D_ROMMEDIA_VIDEO_DIR_NUMBER";
  public static final String S_ROMMEDIA_VIDEO_FILE_NUMBER = "D_ROMMEDIA_VIDEO_FILE_NUMBER";
  public static final String S_SOURCE_CFM_STATE = "D_SOURCE_CFM_NOTIFIY";
  public static final String S_SUBTITLE_ALL_LANG = "D_SUBTITLE_ALL_LANG";
  public static final String S_SUBTITLE_CURR_LANG = "D_SUBTITLE_CURR_LANG";
  public static final String S_SUBTITLE_LANG_ID = "D_SUBTITLE_LANG_ID";
  public static final String S_SUBTITLE_SHOW_MODE = "D_SUBTITLE_SHOW_MODE";
  public static final String S_UNSUPPORT_FILE = "D_UNSUPPORT_FILE";
  public static final String S_VERSION = "I_MPEG_VERSION_NOTIFY";
  public static final String TOTAL_MUSIC_TIME = "music_total_time";
  public static final String TOTAL_VIDEO_TIME = "video_total_time";
  public static final String TRACK_NAME = "music_track_name";
  public static final String TW8816_FORMAT = "tw8816.format";
  public static final int TW8816_TYPE_GDC = 10;
  public static final int TW8816_TYPE_MPEG = 0;
  public static final int TW8816_TYPE_REAR = 2;
  public static final int TYPE_ALL_IMAGES = 0;
  public static final int TYPE_ALL_MUSIC = 6;
  public static final int TYPE_ALL_VIDEOS = 1;
  public static final int TYPE_CAMERA_IMAGES = 2;
  public static final int TYPE_CAMERA_MEDIAS = 4;
  public static final int TYPE_CAMERA_VIDEOS = 3;
  public static final int TYPE_MUSIC_ALBUM = 7;
  public static final int TYPE_MUSIC_ALBUM_TRACK = 8;
  public static final int TYPE_MUSIC_ARTIST = 9;
  public static final int TYPE_MUSIC_ARTIST_TRACK = 10;
  public static final int TYPE_MUSIC_FOLDER = 11;
  public static final int TYPE_MUSIC_FOLDER_TRACK = 12;
  public static final int TYPE_NONE = -1;
  public static final int TYPE_NORMAL_FOLDERS = 5;
  public static final String UPDATE_AUDIO_TIME = "update_audio_time";
  public static final String UPDATE_LIST_VIEW = "update_list_view";
  public static final String UPDATE_TRACK_INFO = "update_track_info";
  public static final String UPDATE_VIDEO_INFO = "update_video_info";
  public static final String UPDATE_VIDEO_TIME = "update_video_time";
  public static final int USB_VIEW_ID = 8;
  public static final int VIDEO_CHANNEL_REQUEST = 1;
  public static final String VIDEO_NAME = "video_name";
  public static final String VIDEO_RECEIVE_NOTIFICATION = "com.winca.service.audiochannel.video";
  public static final int VIEW_MODE_GRID = 1;
  public static final int VIEW_MODE_LIST;

  public static enum DataLocation
  {
    static
    {
      INTERNAL = new DataLocation("INTERNAL", 1);
      EXTERNAL = new DataLocation("EXTERNAL", 2);
      ALL = new DataLocation("ALL", 3);
      DataLocation[] arrayOfDataLocation = new DataLocation[4];
      arrayOfDataLocation[0] = NONE;
      arrayOfDataLocation[1] = INTERNAL;
      arrayOfDataLocation[2] = EXTERNAL;
      arrayOfDataLocation[3] = ALL;
      ENUM$VALUES = arrayOfDataLocation;
    }
  }
}

/* Location:           /home/philip/I045APKWorking/MusicAPK/UnpackClasses/classes-dex2jar.jar
 * Qualified Name:     com.winca.music.player.SystemDef
 * JD-Core Version:    0.6.0
 */