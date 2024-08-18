import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'app.enoh.mobile',
  appName: 'enoh',
  webDir: '../../dist/apps/mobile',
  bundledWebRuntime: false,
  server: {
    androidScheme: 'https',
  },
  plugins: {
    TwitterPlugin: {
      consumerKey: process.env.TWITTER_CONSUMER_KEY,
      consumerSecret: process.env.TWITTER_CONSUMER_SECRET
    },
  }
};

export default config;
