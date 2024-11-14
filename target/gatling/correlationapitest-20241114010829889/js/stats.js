var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2",
        "ok": "0",
        "ko": "2"
    },
    "minResponseTime": {
        "total": "305",
        "ok": "-",
        "ko": "305"
    },
    "maxResponseTime": {
        "total": "615",
        "ok": "-",
        "ko": "615"
    },
    "meanResponseTime": {
        "total": "460",
        "ok": "-",
        "ko": "460"
    },
    "standardDeviation": {
        "total": "155",
        "ok": "-",
        "ko": "155"
    },
    "percentiles1": {
        "total": "460",
        "ok": "-",
        "ko": "460"
    },
    "percentiles2": {
        "total": "538",
        "ok": "-",
        "ko": "538"
    },
    "percentiles3": {
        "total": "600",
        "ok": "-",
        "ko": "600"
    },
    "percentiles4": {
        "total": "612",
        "ok": "-",
        "ko": "612"
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
    "count": 2,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.5",
        "ok": "-",
        "ko": "0.5"
    }
},
contents: {
"req_correlation--ge-91132": {
        type: "REQUEST",
        name: "Correlation- Get all users",
path: "Correlation- Get all users",
pathFormatted: "req_correlation--ge-91132",
stats: {
    "name": "Correlation- Get all users",
    "numberOfRequests": {
        "total": "1",
        "ok": "0",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "615",
        "ok": "-",
        "ko": "615"
    },
    "maxResponseTime": {
        "total": "615",
        "ok": "-",
        "ko": "615"
    },
    "meanResponseTime": {
        "total": "615",
        "ok": "-",
        "ko": "615"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "percentiles1": {
        "total": "615",
        "ok": "-",
        "ko": "615"
    },
    "percentiles2": {
        "total": "615",
        "ok": "-",
        "ko": "615"
    },
    "percentiles3": {
        "total": "615",
        "ok": "-",
        "ko": "615"
    },
    "percentiles4": {
        "total": "615",
        "ok": "-",
        "ko": "615"
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
    "count": 1,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.25",
        "ok": "-",
        "ko": "0.25"
    }
}
    },"req_correlation--ge-e220e": {
        type: "REQUEST",
        name: "Correlation- Get specific user",
path: "Correlation- Get specific user",
pathFormatted: "req_correlation--ge-e220e",
stats: {
    "name": "Correlation- Get specific user",
    "numberOfRequests": {
        "total": "1",
        "ok": "0",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "305",
        "ok": "-",
        "ko": "305"
    },
    "maxResponseTime": {
        "total": "305",
        "ok": "-",
        "ko": "305"
    },
    "meanResponseTime": {
        "total": "305",
        "ok": "-",
        "ko": "305"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "percentiles1": {
        "total": "305",
        "ok": "-",
        "ko": "305"
    },
    "percentiles2": {
        "total": "305",
        "ok": "-",
        "ko": "305"
    },
    "percentiles3": {
        "total": "305",
        "ok": "-",
        "ko": "305"
    },
    "percentiles4": {
        "total": "305",
        "ok": "-",
        "ko": "305"
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
    "count": 1,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.25",
        "ok": "-",
        "ko": "0.25"
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
