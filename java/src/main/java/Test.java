import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * <Description>
 * Copyright © 2006-2017 Tuniu Inc. All rights reserved.<br />
 *
 * @author chenjinlong<br />
 * @CreateDate 14/02/2017 11:41 AM<br />
 * @description <br />
 */
public class Test {

    public static void main(String[] args) {
//        LongAdder longAdder = new LongAdder();
//        longAdder.add(101L);
//        longAdder.increment();
//        long b = longAdder.longValue();
//        int a = 1;
//
//        String str = Test.toFirstUpperCase("");
//        a = 2;
//        Diagnostic

//        String str = String.valueOf(12345);
//        char[] charArr = str.toCharArray();
//
//        int result = 0;
//        for (char c : charArr) {
//            result += Character.getNumericValue(c);
//        }
//        System.out.println(result);

        int[] statues = {6, 2, 3, 8};
        Arrays.sort(statues);
        int count = 0;
        for (int i = 0; i < statues.length; i++) {
            if (i == 0) {
                continue;
            }
            int sta = statues[i] - statues[i - 1];
            if (sta > 1) {
                count += sta - 1;
            }
        }
        return count;
    }

    private static Map<String, String> cacheMap = new ConcurrentHashMap<String, String>();

    /**
     * 首字母变为大写
     *
     * @param word <br>
     * @return <br>
     */
    public static String toFirstUpperCase(String word) {
        String result = cacheMap.get(word);
        if (result == null) {
            result = word.toLowerCase().replaceFirst(word.substring(0, 1).toLowerCase(), word.substring(0, 1).toUpperCase());
            cacheMap.put(word, result);
        }
        return result;
    }
}


//    public static void main(String[] args) {
//        ActorSystem actorSystem = ActorSystem.create("actorSystem");
//        ActorRef worker = actorSystem.actorOf(Props.create(Worker.class, "worker"));
//        ActorRef printer = actorSystem.actorOf(Props.create(Printer.class, "printer"));
//
//        // Watch worker activities.
//        actorSystem.actorOf(Props.create(WatchActor.class, "watchActor"), worker);
//
//        // Case 1: delay and wait for the response.
//        Timeout timeout = new Timeout(Duration.create(5, "seconds"));
//        Future<Object> future = Patterns.ask(worker, "How are you?", timeout);
//        try {
//            String result = (String) Await.result(future, timeout.duration());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Case 2: immediately process.
//        future = Patterns.ask(worker, "How are you? - second time.", timeout);
//        Patterns.pipe(future, actorSystem.dispatcher()).to(printer);
//
//        // To stop worker.
//        worker.tell(PoisonPill.getInstance(), ActorRef.noSender());
//    }


//    private Procedure<Object> green = new Procedure<Object>() {
//        public void apply(Object param) throws Exception {
//            if ("red".equals(param.toString())) {
//                System.out.println("green light");
//            } else {
//                unhandled(param);
//            }
//        }
//    };
//
//    private Procedure<Object> red = new Procedure<Object>() {
//        public void apply(Object param) throws Exception {
//            if ("green".equals(param.toString())) {
//                System.out.println("red light");
//            } else {
//                unhandled(param);
//            }
//        }
//    };
//
//    public void onReceive(Object message) throws Throwable {
//        if (message instanceof String) {
//            if ("red".equals(message.toString())) {
//                getContext().become(red);
//            } else if ("green".equals(message.toString())) {
//                getContext().become(green);
//            } else {
//                unhandled(message);
//            }
//        }
//    }

//    private Router router;
//    {
//        List<Routee> routees = new ArrayList<Routee>();
//        for (int i = 0; i < 10; i++) {
//            ActorRef worker = getContext().actorOf(Props.create(Worker.class, "worker_" + i));
//            getContext().watch(worker);
//            routees.add(new ActorRefRoutee(worker));
//        }
//        // Using round-robin strategy.
//        router = new Router(new RoundRobinRoutingLogic(), routees);
//    }
//
//    public void onReceive(Object message) throws Throwable {
//        if (message instanceof Props) {
//            // We could route received msg with specific router.
//            router.route(message, getSender());
//        } else {
//            unhandled(message);
//        }
//    }

//        ActorSystem actorSystem = ActorSystem.create("actorSystem");
//        ActorRef worker = actorSystem.actorOf(Props.create(Worker.class, "worker"));
//
//        final Inbox inbox = Inbox.create(actorSystem);
//        // In order to receive a msg after the actor stop.
//        // @ref Inbox.receive()
//        inbox.watch(worker);
//        inbox.send(worker, "msg 1");
//
//        try {
//            assert inbox.receive(Duration.create(5, TimeUnit.SECONDS)).equals("msg 1");
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        }

//public final class Message {
//    private final int number;
//
//    private final List<Integer> numberList;
//
//    public Message(int number, List<Integer> numberList) {
//        this.number = number;
//        this.numberList = Collections.unmodifiableList(new ArrayList<Integer>(10));
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public List<Integer> getNumberList() {
//        return numberList;
//    }
//}

//        for (int i = 0; i < 10; i++) {
//            workers.add(system.actorOf(Props.create(MyWorker.class, i), "worker_" + i));
//        }
//        ActorSelection selection = getContext().actorSelection("/user/worker_*");
//        selection.tell("This is a boardcast message.", ActorRef.noSender());

//public class Supervisor extends UntypedActor {
//
//    private static SupervisorStrategy strategy = new OneForOneStrategy(
//            3, Duration.create(60, TimeUnit.SECONDS),
//            new Function<Throwable, SupervisorStrategy.Directive>() {
//                public SupervisorStrategy.Directive apply(Throwable param)
//                        throws Exception {
//                    if (param instanceof NullPointerException) {
//                        System.out.println("NullPointerException occurs.");
//                        return SupervisorStrategy.restart();
//                    } else if (param instanceof IllegalArgumentException) {
//                        System.out.println("IllegalArgumentException occurs.");
//                        return SupervisorStrategy.stop();
//                    }
//                    return SupervisorStrategy.escalate();
//                }
//            });
//
//    @Override
//    public SupervisorStrategy supervisorStrategy() {
//        return strategy;
//    }
//
//    public void onReceive(Object message) throws Throwable {
//        if (message instanceof Props) {
//            // Create a 'restartActor' subInstance.
//            getContext().actorOf((Props)message, "restartActor");
//        } else {
//            unhandled(message);
//        }
//    }
//}


//    public static void main(String[] args) {
//        ActorSystem actorSystem = ActorSystem.create("AkkaController-actorSystem");
//        ActorRef task1Actor = actorSystem.actorOf(Props.create(EAkkaController.class));
//        ActorRef task2Actor = actorSystem.actorOf(Props.create(EAkkaController.class));
//
//        task1Actor.tell("task 1 is running.", ActorRef.noSender());
//        task2Actor.tell("task 2 is running.", ActorRef.noSender());
//    }

//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            public void run() {
//                System.out.println("task 1 is running.");
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            public void run() {
//                System.out.println("task 2 is running.");
//            }
//        }).start();
//    }


