var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1000",
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "60",
        "ok": "60",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1357",
        "ok": "1357",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "171",
        "ok": "171",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "192",
        "ok": "192",
        "ko": "-"
    },
    "percentiles1": {
        "total": "104",
        "ok": "104",
        "ko": "-"
    },
    "percentiles2": {
        "total": "137",
        "ok": "137",
        "ko": "-"
    },
    "percentiles3": {
        "total": "440",
        "ok": "440",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1120",
        "ok": "1120",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 972,
    "percentage": 97
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 27,
    "percentage": 3
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "125",
        "ok": "125",
        "ko": "-"
    }
},
contents: {
"req_get-single-user-27e62": {
        type: "REQUEST",
        name: "Get Single User",
path: "Get Single User",
pathFormatted: "req_get-single-user-27e62",
stats: {
    "name": "Get Single User",
    "numberOfRequests": {
        "total": "1000",
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "60",
        "ok": "60",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1357",
        "ok": "1357",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "171",
        "ok": "171",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "192",
        "ok": "192",
        "ko": "-"
    },
    "percentiles1": {
        "total": "104",
        "ok": "104",
        "ko": "-"
    },
    "percentiles2": {
        "total": "137",
        "ok": "137",
        "ko": "-"
    },
    "percentiles3": {
        "total": "440",
        "ok": "440",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1120",
        "ok": "1120",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 972,
    "percentage": 97
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 27,
    "percentage": 3
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "125",
        "ok": "125",
        "ko": "-"
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
