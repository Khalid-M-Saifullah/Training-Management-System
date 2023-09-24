package com.bjit.trainingmanagementsystem.models.classroom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoticeCreateRequest {

    private String textData;
    private String postDate;
    private String noticeTitle;

    private Long noticeBoardId;
    private Long trainerId;

}
