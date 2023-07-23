var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10",
        "ok": "0",
        "ko": "10"
    },
    "minResponseTime": {
        "total": "100",
        "ok": "-",
        "ko": "100"
    },
    "maxResponseTime": {
        "total": "331",
        "ok": "-",
        "ko": "331"
    },
    "meanResponseTime": {
        "total": "140",
        "ok": "-",
        "ko": "140"
    },
    "standardDeviation": {
        "total": "64",
        "ok": "-",
        "ko": "64"
    },
    "percentiles1": {
        "total": "123",
        "ok": "-",
        "ko": "123"
    },
    "percentiles2": {
        "total": "129",
        "ok": "-",
        "ko": "129"
    },
    "percentiles3": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "percentiles4": {
        "total": "313",
        "ok": "-",
        "ko": "313"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 10,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.429",
        "ok": "-",
        "ko": "1.429"
    }
},
contents: {
"req_update-user-6b160": {
        type: "REQUEST",
        name: "Update User",
path: "Update User",
pathFormatted: "req_update-user-6b160",
stats: {
    "name": "Update User",
    "numberOfRequests": {
        "total": "10",
        "ok": "0",
        "ko": "10"
    },
    "minResponseTime": {
        "total": "100",
        "ok": "-",
        "ko": "100"
    },
    "maxResponseTime": {
        "total": "331",
        "ok": "-",
        "ko": "331"
    },
    "meanResponseTime": {
        "total": "140",
        "ok": "-",
        "ko": "140"
    },
    "standardDeviation": {
        "total": "64",
        "ok": "-",
        "ko": "64"
    },
    "percentiles1": {
        "total": "123",
        "ok": "-",
        "ko": "123"
    },
    "percentiles2": {
        "total": "129",
        "ok": "-",
        "ko": "129"
    },
    "percentiles3": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "percentiles4": {
        "total": "313",
        "ok": "-",
        "ko": "313"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 10,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.429",
        "ok": "-",
        "ko": "1.429"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
