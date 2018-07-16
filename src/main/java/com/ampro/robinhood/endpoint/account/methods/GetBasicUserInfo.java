package com.ampro.robinhood.endpoint.account.methods;

import com.ampro.robinhood.Configuration;
import com.ampro.robinhood.endpoint.account.data.BasicUserInfoElement;
import com.ampro.robinhood.net.request.RequestMethod;
import com.ampro.robinhood.throwables.RobinhoodNotLoggedInException;

public class GetBasicUserInfo extends Account {

    public GetBasicUserInfo(Configuration config)
    throws RobinhoodNotLoggedInException {
        super(config);
        this.setUrlBase(RH_URL + "/user/");

        //This method is ran as GET
        this.setMethodType(RequestMethod.GET);

        //Declare what the response should look like
        this.setReturnType(BasicUserInfoElement.class);

    }

}
