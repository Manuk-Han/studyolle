package com.studyolle.settings;

import com.studyolle.domain.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notifications {

    private boolean studyCreatedByEamail;

    private boolean studyCreatedByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

    private boolean studyUpdateByEmail;

    private boolean studyUpdateByWeb;

    public Notifications(Account account){
        this.studyCreatedByEamail=account.isStudyCreatedByEmail();
        this.studyCreatedByWeb=account.isStudyCreatedByWeb();
        this.studyEnrollmentResultByEmail=account.isStudyEnrollmentResultByEmail();
        this.studyEnrollmentResultByWeb=account.isStudyEnrollmentResultByWeb();
        this.studyUpdateByEmail=account.isStudyCreatedByEmail();
        this.studyUpdateByWeb=account.isStudyCreatedByWeb();
    }
}
